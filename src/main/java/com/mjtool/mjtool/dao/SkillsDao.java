package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsDao extends JpaRepository<Skills, Integer> {
    List<Skills> findAll();
    Skills findById(int id);
    Skills save(Skills skills);
}
