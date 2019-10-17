package com.example.demo.services;

import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.GetCartRequest;

public interface CartService {

    GetCartResponse view(GetCartRequest getCartRequest);

    GetCartResponse add(GetCartRequest getCartRequest);

    GetCartResponse remove(GetCartRequest getCartRequest);

    GetCartResponse drop(GetCartRequest getCartRequest);

    GetCartResponse checkout(GetCartRequest getCartRequest);

    boolean present(GetCartRequest getCartRequest);

}
