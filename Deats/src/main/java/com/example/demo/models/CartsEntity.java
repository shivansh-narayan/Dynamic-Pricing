package com.example.demo.models;


import com.example.demo.dto.Products;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@Data
@Document(collection = "cart")
public class CartsEntity {

    @Id
    String cartId;
    List<Products> products;
}
