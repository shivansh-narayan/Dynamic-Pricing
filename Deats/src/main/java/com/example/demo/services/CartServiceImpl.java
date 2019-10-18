package com.example.demo.services;

import com.example.demo.dto.Grocers;
import com.example.demo.dto.Products;
import com.example.demo.exchanges.CreateCartRequest;
import com.example.demo.exchanges.GetCartResponse;
import com.example.demo.exchanges.GetCartRequest;
import com.example.demo.exchanges.GetCartUpdateRequest;
import com.example.demo.models.CartsEntity;
import com.example.demo.models.MarketsEntity;
import com.example.demo.repositories.CartsRepository;
import com.example.demo.repositories.MarketsRepository;
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
    @Autowired
    MarketsRepository marketsRepository;
    @Override
    public GetCartResponse view(GetCartRequest getCartRequest) {
        String cartId = getCartRequest.getCartId();

        Optional<CartsEntity> byId = cartsRepository.findById(cartId);

        CartsEntity cartsEntity = byId.get();
        GetCartResponse getCartResponse;

        getCartResponse= new GetCartResponse(cartsEntity.getCartId(),cartsEntity.getEmail(),cartsEntity.getProducts());

        return getCartResponse;


    }

    @Override
    public GetCartResponse add(GetCartUpdateRequest getCartUpdateRequest) {

        int productIndex= getCartUpdateRequest.getProductIndex();
        String cartId = getCartUpdateRequest.getCartId();
        String grocer = getCartUpdateRequest.getGrocer();
        String market = getCartUpdateRequest.getMarket();
        int quantity = getCartUpdateRequest.getQuantity();

        Optional<CartsEntity> byId = cartsRepository.findById(cartId);
        CartsEntity cartsEntity = byId.get();
        List<Products> products = cartsEntity.getProducts();
        int price =0 ;
        List<MarketsEntity> all = marketsRepository.findAll();
        for(MarketsEntity m : all)
        {
            if(m.getName().equalsIgnoreCase(market))
            {
                Grocers[] grocers = m.getGrocers();
                for(Grocers g : grocers)
                {
                    if(g.getName().equalsIgnoreCase(grocer))
                    {
                        int[] price1 = g.getPrice();
                        price=price1[productIndex];
                    }
                }
            }
        }
        String[] index = {"Onion", "tomato", "rice", "wheat", "apple"};
        String productName= index[productIndex];
        Products newProduct =new Products(productName,quantity,price,market,grocer);

        products.add(newProduct);

        cartsRepository.save(cartsEntity);
        return new GetCartResponse(cartsEntity.getCartId(),cartsEntity.getEmail(),cartsEntity.getProducts());
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

    @Override
    public GetCartResponse create(CreateCartRequest createCartRequest) {

        String email=createCartRequest.getEmail();
         CartsEntity cartsEntity = new CartsEntity();
         cartsEntity.setEmail(email);

         cartsRepository.insert(cartsEntity);

        List<CartsEntity> all = cartsRepository.findAll();


        for(CartsEntity c : all) {
            if(c.getEmail().equalsIgnoreCase(email))
            {
                return  new GetCartResponse(c.getCartId(),c.getEmail(),c.getProducts());
            }
        }

        return null;
    }
}
