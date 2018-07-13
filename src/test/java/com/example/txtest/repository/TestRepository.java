package com.example.txtest.repository;

import com.example.txtest.entity.Court;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepository {
    @Autowired
    private CourtDao courtDao;

    @Test
    public void testFindByCourtId() {
        Court court = courtDao.findByCourtId(2);
        System.out.println(court);
//        courtDao.updateCourt(1);
//        court = courtDao.findByCourtId(1);
//        System.out.println(court);
//        court = courtDao.findByCourtId(1);
//        System.out.println(court);
    }
}
