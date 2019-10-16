package com.example.demo.repositoryservices;

import com.example.demo.exchanges.GetMarketsRequest;

import java.util.List;

public class MarketRepositoryServicesImpl implements MarketRepositoryServices {
    @Override
    public List<String> findMarketsNearby(GetMarketsRequest getMarketsRequest) {
        int distance = getMarketsRequest.getDistance();

        List<String> ans;

        return null;

    }
}
