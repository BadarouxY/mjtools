package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpellDao extends JpaRepository<Spell, Integer> {
    List<Spell> findAll();
    Spell findById(int id);
    Spell save(Spell spell);
}
