package com.example.txtest.service;

import com.example.txtest.entity.Court;
import com.example.txtest.entity.Courtm;
import com.example.txtest.entity.User;
import com.example.txtest.entity.Userm;
import com.example.txtest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author mutouji
 */
@Service
public class UserService {

    // 每个场地对多10人
    private int COURT_MAX_NUM = 10;

    @Autowired
    private UserDao userDao;

    @Autowired
    private CourtDao courtDao;

    @Autowired
    private UsermDao usermDao;

    @Autowired
    private CourtmDao courtmDao;

    @Autowired
    private MongoDao mongoDao;

    @Transactional
    public String addUser(int courtId, int userId) {
        Court court = courtDao.findByCourtId(courtId);


        if(court == null) {
            courtDao.save(new Court(courtId, 1));
        } else {
            courtDao.updateCourt(courtId);
        }

//        int div = 1 / 0;

        User result = userDao.save(new User(courtId, userId));
        return "add user " + result.getUserId() + " success!";
    }

    public void addOneUserCourt(int courtId, int userId) {

    }

    public String addUserm(String courtId, String userId) {
        Courtm court = courtmDao.findCourtmByCourtId(courtId);

        if(court == null) {
            courtmDao.save(new Courtm(courtId, 1));
        } else {
            mongoDao.updateCourtm(courtId, 1);
        }

        int div = 1 / 0;

        Userm result = usermDao.save(new Userm(courtId, userId));
        return "add user " + result.getUserId() + " success!";
    }

}
