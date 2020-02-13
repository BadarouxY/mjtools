package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Fight;
import com.mjtool.mjtool.model.Personn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnDao extends JpaRepository<Personn, Integer> {
    Personn save(Personn fight);
    Personn findById(int id);
    List<Personn> findAll();
}
