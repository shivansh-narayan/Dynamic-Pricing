package com.example.demo.services;

import com.example.demo.exchanges.CreateCartRequest;
import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.GetCartRequest;
import com.example.demo.exchanges.GetCartUpdateRequest;

public interface CartService {

    GetCartResponse view(GetCartRequest getCartRequest);

    GetCartResponse add(GetCartUpdateRequest getCartUpdateRequest);

    GetCartResponse remove(GetCartRequest getCartRequest);

    GetCartResponse drop(GetCartRequest getCartRequest);

    GetCartResponse checkout(GetCartRequest getCartRequest);

    boolean present(GetCartRequest getCartRequest);

    GetCartResponse create(CreateCartRequest createCartRequest);

}
