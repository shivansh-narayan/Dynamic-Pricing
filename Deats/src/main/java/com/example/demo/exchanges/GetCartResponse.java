package com.example.demo.exchanges;


import com.example.demo.dto.Products;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class GetCartResponse {

    int number;
    List<Products> products;
    int totall;
}
