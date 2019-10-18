package com.example.demo.services;

import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.GetCartRequest;
import com.example.demo.models.CartsEntity;
import com.example.demo.repositories.CartsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartsRepository cartsRepository;
    @Override
    public GetCartResponse view(GetCartRequest getCartRequest) {
        String cartId = getCartRequest.getCartId();

        Optional<CartsEntity> byId = cartsRepository.findById(cartId);

        CartsEntity cartsEntity = byId.get();
        GetCartResponse getCartResponse;

        getCartResponse= new GetCartResponse(cartsEntity.getCartId(),cartsEntity.getProducts());

        return getCartResponse;


    }

    @Override
    public GetCartResponse add(GetCartRequest getCartRequest) {
        return null;
    }

    @Override
    public GetCartResponse remove(GetCartRequest getCartRequest) {
        return null;
    }

    @Override
    public GetCartResponse drop(GetCartRequest getCartRequest) {
        return null;
    }

    @Override
    public GetCartResponse checkout(GetCartRequest getCartRequest) {
        return null;
    }

    @Override
    public boolean present(GetCartRequest getCartRequest) {
        String cartId = getCartRequest.getCartId();

        Optional<CartsEntity> byId = cartsRepository.findById(cartId);

        if(byId.isPresent()) {
            log.info("cart is present");
            return true;
        }
        else {
            log.info("cart is not present");
            return false;
        }


    }
}
