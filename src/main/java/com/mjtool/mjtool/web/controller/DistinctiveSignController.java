package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.DistinctiveSignsDao;
import com.mjtool.mjtool.model.DistinctiveSign;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistinctiveSignController {
    @Autowired
    private DistinctiveSignsDao distinctiveSignsDao;

    @RequestMapping(value = "/distinctivesigns", method = RequestMethod.GET)
    public List<DistinctiveSign> distinctiveSignsList() {
        return distinctiveSignsDao.findAll();
    }

    @RequestMapping(value = "/distinctivesigns/{id}", method = RequestMethod.GET)
    public DistinctiveSign getDistinctivesSign(@PathVariable int id) {
        DistinctiveSign distinctiveSign = distinctiveSignsDao.findById(id);

        if (distinctiveSign == null) throw new NoModelException("No Distinctive Signs " + id);

        return distinctiveSignsDao.findById(id);
    }
}
