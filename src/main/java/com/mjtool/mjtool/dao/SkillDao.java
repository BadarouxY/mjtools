package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillDao extends JpaRepository<Skill, Integer> {
    List<Skill> findAll();
    Skill findById(int id);
    Skill save(Skill skill);
}
