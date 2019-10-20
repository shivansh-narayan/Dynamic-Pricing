package com.example.demo.services;

import com.example.demo.dto.Grocers;
import com.example.demo.dto.Products;
import com.example.demo.exchanges.GetProductsResponse;
import com.example.demo.models.MarketsEntity;
import com.example.demo.repositories.MarketsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Log4j2
@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    MarketsRepository marketsRepository;

    public int getPrice(String productName,String market,int life,int quantity,int demand)
    {
        //demand= demand/10;
        float bhejo = (float)demand/100;
        String url = "http://192.168.137.1:5000/api/"+productName+"/"+market+"/"+life+"/"+quantity+"/"+bhejo; // TODO: utkash ka api daalna hai
        String newPriceString="0";
        int newPrice=0;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            //add headers to the connection, or check the status if desired..

            // handle error response code it occurs

            InputStream inputStream=connection.getInputStream();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            inputStream));

            StringBuilder response = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null)
                response.append(currentLine);

            in.close();

            newPriceString = response.toString();
            log.error(newPriceString);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        //newPrice = Float.parseFloat(newPriceString);

        return (int)Float.parseFloat(newPriceString);
    }

    @Override
    public void update(GetProductsResponse getProductsResponse)  {

        List<Products> products = getProductsResponse.getAns();

        int newPrice=0; // the updated price will be stored here
        for (Products p : products) {
            String productName = p.getName();
            String market = p.getMarket();
            String grocer = p.getGrocer();
            int quantity = p.getQuantity();
            int demand=0;
            int price;
            int life=0;
            // {"Onion", "tomato", "rice", "wheat", "apple"}   ye product ka index hai

            // finding index

            String[] index = {"Apple", "Banana", "rice", "wheat", "apple"};
            int i=0; // actuall index
            for(String s : index)
            {
                if(s.equalsIgnoreCase(productName))
                    break;
                i++;
            }
            List<MarketsEntity> all = marketsRepository.findAll();

            MarketsEntity changeValue= new MarketsEntity();
            for (MarketsEntity m : all) {
                if (m.getName().equalsIgnoreCase(market)) {
                    changeValue=m;
                    demand = m.getDemand()[i];
                    life=m.getLife()[i];
                    Grocers[] grocers = m.getGrocers();
                    int total = 0;
                    for (Grocers g : grocers) {
                        if (g.getName().equalsIgnoreCase(grocer)) {

                            int[] quantity1 = g.getQuantity();

                            total+=quantity1[i];
                            quantity1[i]-=quantity;

                            g.setQuantity(quantity1);
                        }
                        //price1[i]=getPrice(productName,market,life,quantity,demand);
                        // TODO : hard coding htao
                        int[] price1 = g.getPrice();
                        //price1[i]=1060017;
                        price1[i]=getPrice(productName,market,life,total,demand);
                        log.error(price1[i]);
                        g.setPrice(price1);

                    }

                    int[] demand1 = m.getDemand();
                    demand1[i]+=quantity;
                    m.setDemand(demand1);
                    marketsRepository.save(m);

                }
            }



            // todo : demand change krnni hai
            //changeValue.getDemand()[i]+=quantity;
            // todo : quantity change krni hai


            // todo : price change krna hai


            // i index hai aage use krne ke lie







        }

        //return newPrice;
    }
}
