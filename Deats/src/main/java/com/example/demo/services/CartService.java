package com.example.demo.services;

import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.ViewCartRequest;

public interface CartService {

    GetCartResponse view(ViewCartRequest viewCartRequest);

}
