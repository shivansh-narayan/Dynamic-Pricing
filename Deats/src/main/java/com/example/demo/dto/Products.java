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
    String market;
    String grocer;

    public Products(int i, int q, String s,String m, String g) {

        price = i;
        quantity= q;
        name =s;
        market=m;
        grocer=g;

    }
}
