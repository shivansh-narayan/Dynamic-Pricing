package com.example.demo.exchanges;


import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class GetProductRequest {

    private String groceryName;
    private String marketName;
}
