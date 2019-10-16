package com.example.demo.repositoryservices;

import com.example.demo.exchanges.GetMarketsRequest;

import java.util.List;

public interface MarketRepositoryServices {

    List<String> findMarketsNearby(GetMarketsRequest getMarketsRequest);
}
