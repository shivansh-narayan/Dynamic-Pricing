package com.example.demo.exchanges;

import com.example.demo.dto.Products;
import lombok.Data;
import lombok.Setter;

import java.util.List;


@Data
@Setter
public class GetProductsResponse {

    List<Products> ans;
}
