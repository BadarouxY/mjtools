package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Traits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraitsDao extends JpaRepository<Traits, Integer> {
    List<Traits> findAll();
    Traits findById(int id);
    Traits save(Traits traits);
}
