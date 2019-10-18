package com.example.demo.exchanges;


import com.example.demo.dto.Products;
import lombok.Data;
import lombok.Getter;
import org.bson.types.ObjectId;

import java.util.List;

@Data
@Getter
public class GetCartResponse {

    String cartId;
    List<Products> products;

    public GetCartResponse(String i, List<Products> p) {
        cartId=i;
        products=p;
    }
    //int totall;
}
