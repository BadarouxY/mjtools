package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Fight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FightDao extends JpaRepository<Fight, Integer> {
    Fight save(Fight fight);
    Fight findById(int id);
    List<Fight> findAll();
    List<Fight> findByIsEndedFalse();
}
