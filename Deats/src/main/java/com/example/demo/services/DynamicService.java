package com.example.demo.services;

import com.example.demo.exchanges.GetProductsResponse;

import java.io.IOException;
import java.net.MalformedURLException;

public interface DynamicService {

    void update(GetProductsResponse getProductsResponse) ;
}
