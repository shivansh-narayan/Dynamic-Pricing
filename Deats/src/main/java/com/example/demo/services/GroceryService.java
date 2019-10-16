package com.example.demo.services;

import com.example.demo.exchanges.GetGrocersRequest;
import com.example.demo.exchanges.GetGrocersResponse;

public interface GroceryService {

    GetGrocersResponse findGroceryByMarket(GetGrocersRequest getGrocersRequest);
}
