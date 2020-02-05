package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterDao extends JpaRepository<Character, Integer> {
    List<Character> findAll();
    Character findById(int id);
    Character save(Character character);
    List<Character> findByIsNpcTrue();
    @Query(value = "SELECT c FROM Character c WHERE c.isEnemy = false and c.isNpc = false")
    List<Character> findPlayables();
    List<Character> findByIsEnemyTrue();
    void deleteById(int id);


}
