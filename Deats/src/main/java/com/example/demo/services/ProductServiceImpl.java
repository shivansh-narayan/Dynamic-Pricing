package com.example.demo.services;


import com.example.demo.dto.Grocers;
import com.example.demo.dto.Products;
import com.example.demo.exchanges.GetProductRequest;
import com.example.demo.exchanges.GetProductsResponse;
import com.example.demo.models.MarketsEntity;
import com.example.demo.repositories.MarketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    MarketsRepository marketsRepository;
    @Override
    public GetProductsResponse findProductByGrocery(GetProductRequest getProductRequest) {

        String groceryName= getProductRequest.getGroceryName();
        String marketName = getProductRequest.getMarketName();
        List<MarketsEntity> all = marketsRepository.findAll();


        List<Products> temp = new ArrayList<>();
        for(MarketsEntity m : all)
        {
            if(m.getName().equalsIgnoreCase(marketName))
            {
                Grocers[] grocers = m.getGrocers();
                for(Grocers g : grocers) {
                    if(g.getName().equalsIgnoreCase(groceryName))
                    {
                        int[] price = g.getPrice();
                        int[] quantity = g.getQuantity();

                        String[] name= {"Onion", "tomato", "rice", "wheat", "apple"};

                        for(int i=0;i<4;i++)
                        {
                            temp.add(new Products(price[i],quantity[i],name[i]));
                        }
                        break;
                    }
                }
                break;
            }
        }

        return new GetProductsResponse(temp);
    }
}
