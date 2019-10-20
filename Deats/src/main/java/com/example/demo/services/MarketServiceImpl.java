package com.example.demo.services;

import com.example.demo.exchanges.GetDemandRequest;
import com.example.demo.models.MarketsEntity;
import com.example.demo.exchanges.GetMarketsRequest;
import com.example.demo.exchanges.GetMarketsResponse;
import com.example.demo.repositories.MarketsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Log4j2
@Service
public class MarketServiceImpl implements MarketService {

    @Autowired
    private MarketsRepository marketsRepository;


    @Override
    public GetMarketsResponse findMarketsCloseBy(GetMarketsRequest getMarketsRequest) {

        // final list of restaurants will be stored here
        List<String> temp = new ArrayList<>();
        List<MarketsEntity> all=marketsRepository.findAll();
        for(MarketsEntity m : all) {
            temp.add(m.getName());
        }
        return new GetMarketsResponse(temp);
    }

    @Override
    public Integer findDemand(GetDemandRequest getDemandRequest) {
        String market = getDemandRequest.getMarket();
        int index = getDemandRequest.getIndex();
        List<MarketsEntity> all=marketsRepository.findAll();
        int [] demand = new int[5];
        for(MarketsEntity m : all) {
            if(m.getName().equalsIgnoreCase(market))
            {
                 demand = m.getDemand();
            }
        }
        return  demand[index];

    }
}
