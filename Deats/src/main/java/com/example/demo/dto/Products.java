package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {

    String name;
    int quantity;
    int price;

    public Products(int i, int q, String s) {
        price=i;
        quantity=q;
        name=s;
    }
}
