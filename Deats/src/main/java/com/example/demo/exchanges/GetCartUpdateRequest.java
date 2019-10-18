package com.example.demo.exchanges;

import lombok.Data;

@Data
public class GetCartUpdateRequest {

    String cartId;
    int productIndex;
    String market;
    String grocer;
    int quantity;
}
