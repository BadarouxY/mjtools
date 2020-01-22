package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeDao extends JpaRepository<Attribute, Integer> {
    Attribute save(Attribute attribute);
    List<Attribute> findAll();
    Attribute findById(int id);
}
