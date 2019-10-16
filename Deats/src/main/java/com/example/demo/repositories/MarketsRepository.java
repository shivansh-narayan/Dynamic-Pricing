package com.example.demo.repositories;

import com.example.demo.models.MarketsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarketsRepository extends MongoRepository<MarketsEntity,String> {

    @Override
    List<MarketsEntity> findAll();

}
