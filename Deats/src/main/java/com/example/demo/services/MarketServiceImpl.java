package com.example.demo.services;

import com.example.demo.exchanges.GetMarketsRequest;
import com.example.demo.exchanges.GetMarketsResponse;
import com.example.demo.repository.MarketRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {


    @Override
    public GetMarketsResponse findMarketsCloseBy(GetMarketsRequest getMarketsRequest) {


        List<String> temp= new ArrayList<>();
        temp.add("Azadpur");
        temp.add("Keshopur");
        temp.add("Shahdara");
        GetMarketsResponse getMarketsResponse= new GetMarketsResponse(temp);

        return getMarketsResponse;
    }
}
