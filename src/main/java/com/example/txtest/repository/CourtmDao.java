package com.example.txtest.repository;

import com.example.txtest.entity.Courtm;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CourtmDao extends MongoRepository<Courtm, String> {
    Courtm findCourtmByCourtId(String id);
}
