package com.example.demo.exchanges;

import com.example.demo.dto.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.List;


@Data
@Setter
@AllArgsConstructor
public class GetProductsResponse {

    List<Products> ans;
}
