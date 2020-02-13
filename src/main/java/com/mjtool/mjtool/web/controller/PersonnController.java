package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.PersonnDao;
import com.mjtool.mjtool.model.Personn;
import com.mjtool.mjtool.model.Trait;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
public class PersonnController {
    @Autowired
    private PersonnDao personnDao;

    @RequestMapping(value = "/personn", method = RequestMethod.GET)
    public List<Personn> personnList() {
        return personnDao.findAll();
    }

    @RequestMapping(value = "/personn/{id}", method = RequestMethod.GET)
    public Personn getPersonn(@PathVariable int id) {
        Personn personn = personnDao.findById(id);

        if (personn == null) throw new NoModelException("No Personn " + id);

        return personnDao.findById(id);
    }

    @PostMapping(value = "/personn")
    public ResponseEntity<Void> addPersonn(@RequestBody Personn personn) {
        Personn personnAdded = personnDao.save(personn);
        if (personnAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personnAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/personn/update")
    public void updatePersonn(@RequestBody Personn personn) {
        personnDao.save(personn);
    }

    @RequestMapping(value = "/personn/delete/{id}")
    public void deletePersonn(@PathVariable int id) {
        personnDao.deleteById(id);
    }

}
