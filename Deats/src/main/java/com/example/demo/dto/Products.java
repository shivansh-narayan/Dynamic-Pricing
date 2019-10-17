package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {

    String name;
    String market;
    String grocer;
    int quantity;
    int price;

    public Products(String name, String market, String grocer, int quantity, int price) {
        this.name = name;
        this.market = market;
        this.grocer = grocer;
        this.quantity = quantity;
        this.price = price;
    }
}
