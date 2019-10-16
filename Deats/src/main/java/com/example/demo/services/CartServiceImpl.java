package com.example.demo.services;

import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.ViewCartRequest;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public GetCartResponse view(ViewCartRequest viewCartRequest) {
        return null;
    }
}
