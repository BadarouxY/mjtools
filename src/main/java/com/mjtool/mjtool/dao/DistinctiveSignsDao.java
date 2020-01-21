package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.DistinctiveSigns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistinctiveSignsDao extends JpaRepository<DistinctiveSigns, Integer> {
    List<DistinctiveSigns> findAll();
    DistinctiveSigns findById(int id);
    DistinctiveSigns save(DistinctiveSigns distinctiveSigns);
}
