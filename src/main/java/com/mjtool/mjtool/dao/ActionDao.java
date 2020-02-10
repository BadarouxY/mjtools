package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionDao extends JpaRepository<Action, Integer> {
    Action save(Action attribute);
    Action findById(int id);
    List<Action> findByFightId(int id);
}
