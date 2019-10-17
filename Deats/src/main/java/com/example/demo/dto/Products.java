package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    String name;
    int quantity;
    int price;

    public Products(int i, int q, String s) {

        price = i;
        quantity= q;
        name =s;

    }
}
