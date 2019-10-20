package com.example.demo.exchanges;

import lombok.Data;

@Data
public class GetDemandRequest {

    String market;
    int index;
}
