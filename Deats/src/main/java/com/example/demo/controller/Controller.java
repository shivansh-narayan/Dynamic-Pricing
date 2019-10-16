package com.example.demo.controller;


import com.example.demo.exchanges.*;
import com.example.demo.services.GroceryService;
import com.example.demo.services.MarketService;
import com.example.demo.services.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
@RequestMapping(Controller.MARKET_API_ENDPOINT)
public class Controller {

    public static final String MARKET_API_ENDPOINT = "/deats";
    public static final String MARKETS_API = "/markets";

    public static final String GROCERS_API = "/grocers";

    public static final String PRODUCTS_API = "/products";

    @Autowired
    private MarketService marketService;
    @Autowired
    private GroceryService groceryService;
    @Autowired
    private ProductService productService;



    /*
        gives nearby areas
        also can search a particular area
     */
    @GetMapping(MARKETS_API)
    public ResponseEntity<GetMarketsResponse> getMarkets(GetMarketsRequest getMarketsRequest) {
        GetMarketsResponse getMarketsResponse;

        getMarketsResponse = marketService.findMarketsCloseBy(getMarketsRequest);

        return ResponseEntity.ok().body(getMarketsResponse);
    }

    @GetMapping(GROCERS_API)
    public ResponseEntity<GetGrocersResponse> getGrocers (GetGrocersRequest getGrocersRequest) {

        GetGrocersResponse getGrocersResponse = groceryService.findGroceryByMarket(getGrocersRequest);
        return ResponseEntity.ok().body(getGrocersResponse);
    }

    @GetMapping(PRODUCTS_API)
    public ResponseEntity<GetProductsResponse> getProducts (GetProductRequest getProductRequest) {

        GetProductsResponse getProductsResponse= productService.findProductByGrocery(getProductRequest);

        return ResponseEntity.ok().body(getProductsResponse);
    }


}
