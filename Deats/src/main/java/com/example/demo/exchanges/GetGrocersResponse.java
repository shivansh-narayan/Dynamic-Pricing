package com.example.demo.exchanges;

import lombok.Data;
import lombok.Setter;

import java.util.List;


@Data
@Setter
public class GetGrocersResponse {

    final List<String> ans;
}
