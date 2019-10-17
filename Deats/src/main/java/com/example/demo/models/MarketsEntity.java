package com.example.demo.models;

import com.example.demo.dto.Grocers;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@NoArgsConstructor
@Data
@Document(collection = "markets")
public class MarketsEntity {

    @Id
    public String id;
    String name;
    int[] demand;
    Grocers[] grocers;

    }

