package com.example.demo.repositories;

import com.example.demo.models.CartsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartsRepository extends MongoRepository<CartsEntity,String> {

}
