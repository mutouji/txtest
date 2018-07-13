package com.example.txtest.repository;

import com.example.txtest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mutouji
 */
//@Transactional(rollbackFor = Exception.class)
//@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
