package com.example.demo.services;

import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.ViewCartRequest;
import com.example.demo.models.CartsEntity;
import com.example.demo.repositories.CartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartsRepository cartsRepository;
    @Override
    public GetCartResponse view(ViewCartRequest viewCartRequest) {
        String cartId = viewCartRequest.getCartId();

        List<CartsEntity> all = cartsRepository.findAll();
        GetCartResponse getCartResponse;
        /*for(CartsEntity c : all) {
            if(c.getCartId().equals(cartId))
        }*/

        return null;


    }
}
