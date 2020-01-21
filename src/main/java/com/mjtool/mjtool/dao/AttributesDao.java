package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributesDao extends JpaRepository<Attributes, Integer> {
    Attributes save(Attributes attributes);
    List<Attributes> findAll();
    Attributes findById(int id);
}
