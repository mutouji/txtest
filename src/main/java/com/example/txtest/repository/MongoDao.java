package com.example.txtest.repository;

import com.example.txtest.entity.Courtm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;


/**
 * @author mutouji
 */
@Component
public class MongoDao {
    private MongoTemplate mongoTemplate;

    public MongoDao(@Autowired MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void updateCourtm(String id, int num) {
        Query query = new Query();
        query.addCriteria(Criteria.where("courtId").is(id));
        Update update = new Update().inc("num", num);
        mongoTemplate.updateFirst(query, update, Courtm.class);
    }
}
