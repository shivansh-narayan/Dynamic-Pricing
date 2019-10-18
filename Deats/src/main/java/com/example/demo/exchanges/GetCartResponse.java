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
    String email;
    List<Products> products;

    public GetCartResponse(String i,String e, List<Products> p) {
        email=e;
        cartId=i;
        products=p;
    }
    //int totall;
}
