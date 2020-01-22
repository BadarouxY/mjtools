package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraitDao extends JpaRepository<Trait, Integer> {
    List<Trait> findAll();
    Trait findById(int id);
    Trait save(Trait trait);
}
