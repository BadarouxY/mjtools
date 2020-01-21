package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareerDao extends JpaRepository<Career, Integer> {
    Career save(Career career);
    List<Career> findAll();
    Career findById(int id);
}
