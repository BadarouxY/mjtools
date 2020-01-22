package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.DistinctiveSign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistinctiveSignsDao extends JpaRepository<DistinctiveSign, Integer> {
    List<DistinctiveSign> findAll();
    DistinctiveSign findById(int id);
    DistinctiveSign save(DistinctiveSign distinctiveSign);
}
