package com.example.demo.services;

import com.example.demo.exchanges.GetGrocersRequest;
import com.example.demo.exchanges.GetGrocersResponse;
import com.example.demo.exchanges.GetMarketsResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class GroceryServiceImpl implements GroceryService {
    @Override
    public GetGrocersResponse findGroceryByMarket(GetGrocersRequest getGrocersRequest) {

        String name = getGrocersRequest.getMarketName();
        log.info(name);
        List<String> m1= Arrays.asList("Gupta Grocers", "Sharma kirana", "Arvind Stores");
        List<String> m2= Arrays.asList("Hometown Gourmet","Green and Fresh","Able Market");
        List<String> m3= Arrays.asList("TheFarmStand","The Farm Shop","Farmopolis");
        GetGrocersResponse getGrocersResponse = new GetGrocersResponse(m1);
        //{"Shahdara","Keshopur","Azadpur"}
        if(name.equals("Shahdara"))
            getGrocersResponse = new GetGrocersResponse(m1);
        else if(name.equals("Keshopur"))
            getGrocersResponse = new GetGrocersResponse(m2);
        else if(name.equals("Azadpur"))
            getGrocersResponse = new GetGrocersResponse(m3);

        return getGrocersResponse;
    }
}
