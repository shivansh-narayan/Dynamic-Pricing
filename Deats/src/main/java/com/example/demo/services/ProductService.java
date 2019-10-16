package com.example.demo.services;

import com.example.demo.exchanges.GetProductRequest;
import com.example.demo.exchanges.GetProductsResponse;

public interface ProductService {

    GetProductsResponse findProductByGrocery(GetProductRequest getProductRequest);
}
