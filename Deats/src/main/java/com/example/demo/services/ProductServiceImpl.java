package com.example.demo.services;


import com.example.demo.exchanges.GetProductRequest;
import com.example.demo.exchanges.GetProductsResponse;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public GetProductsResponse findProductByGrocery(GetProductRequest getProductRequest) {

        String groceryName= getProductRequest.getGroceryName();
        String marketName = getProductRequest.getMarketName();





        return null;


    }
}
