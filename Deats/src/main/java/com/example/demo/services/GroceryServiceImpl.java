package com.example.demo.services;

import com.example.demo.dto.Grocers;
import com.example.demo.exchanges.GetGrocersRequest;
import com.example.demo.exchanges.GetGrocersResponse;
import com.example.demo.exchanges.GetMarketsResponse;
import com.example.demo.models.MarketsEntity;
import com.example.demo.repositories.MarketsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class GroceryServiceImpl implements GroceryService {

    @Autowired
    MarketsRepository marketsRepository;
    @Override
    public GetGrocersResponse findGroceryByMarket(GetGrocersRequest getGrocersRequest) {

        String name = getGrocersRequest.getMarketName();
        log.info(name);
        List<MarketsEntity> temp=marketsRepository.findAll();

        List<String> ans = new ArrayList<>();
        for(MarketsEntity m : temp) {

            if(m.getName().equalsIgnoreCase(name))
            {
                Grocers[] grocers = m.getGrocers();
                for(Grocers g : grocers)
                {
                    ans.add(g.getName());
                }
                break;
            }
        }
        return new GetGrocersResponse(ans);
    }
}
