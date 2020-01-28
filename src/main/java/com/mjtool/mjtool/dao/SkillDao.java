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
  //  @Query("DELETE FROM Skill s WHERE s.name = :name AND s.character_id = :character_id")
  //  void deleteSkill(@Param("name") String name, @Param("character_id") int id);

   // List<Skill> findByCharacterId(int characterId);
}
