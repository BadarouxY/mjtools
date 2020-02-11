package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterDao extends JpaRepository<Character, Integer> {
    List<Character> findAll();
    List<Character> findByIsActiveTrue();
    List<Character> findByIsActiveFalse();
    Character findById(int id);
    Character save(Character character);
    List<Character> findByIsNpcTrueAndIsActiveTrue();
    @Query(value = "SELECT c FROM Character c WHERE c.isEnemy = false and c.isNpc = false and c.isActive = true")
    List<Character> findPlayables();
    List<Character> findByIsEnemyTrueAndIsActiveTrue();
    void deleteById(int id);


}
