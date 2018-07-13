package com.example.txtest.repository;

import com.example.txtest.entity.Court;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mutouji
 */
//@Transactional(rollbackFor = Exception.class)
//@Repository
public interface CourtDao extends JpaRepository<Court, Integer> {
    @Cacheable(value="court", key="#p0")
    @Query(value = "select c from Court c where c.courtId = ?1")
    Court findByCourtId(int courtId);

    @CacheEvict(value="court", key="#p0")
    @Modifying
    @Transactional
    @Query(value = "update Court c set c.num = c.num + 1 where c.courtId = ?1")
    int updateCourt(int courtId);
}
