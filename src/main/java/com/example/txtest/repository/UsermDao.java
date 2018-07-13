package com.example.txtest.repository;

import com.example.txtest.entity.Userm;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsermDao extends MongoRepository<Userm, String> {
}
