package com.example.demo.exchanges;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class GetMarketsRequest {

    private String name;
    private int distance;
}
