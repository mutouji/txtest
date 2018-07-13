package com.example.txtest.service;

import com.example.txtest.entity.User;
import com.example.txtest.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SysConfigService {
//    @Autowired
//    private UserDao sysConfigRepository;
//
//    public User getSysConfig(int keyName) {
//        User entity = sysConfigRepository.findById(keyName);
//        return entity;
//    }
//
//    public User saveSysConfig(User entity) {
//
//        return sysConfigRepository.save(entity);
//
//    }
//
//    @Transactional
//    public void testSysConfig(User entity) throws Exception {
//        //不会回滚
//        this.saveSysConfig(entity);
//        throw new Exception("sysconfig error");
//
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void testSysConfig1(User entity) throws Exception {
//        //会回滚
//        this.saveSysConfig(entity);
//        throw new Exception("sysconfig error");
//
//    }
//
//    @Transactional
//    public void testSysConfig2(User entity) throws Exception {
//        //会回滚
//        this.saveSysConfig(entity);
//        throw new RuntimeException("sysconfig error");
//
//    }
//
//    @Transactional
//    public void testSysConfig3(User entity) throws Exception {
//        //事务仍然会被提交
//        this.testSysConfig4(entity);
//        throw new Exception("sysconfig error");
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void testSysConfig4(User entity) throws Exception {
//
//        this.saveSysConfig(entity);
//    }
}
