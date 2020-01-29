package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.TraitDao;
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
public class TraitController {
    @Autowired
    private TraitDao traitDao;

    @RequestMapping(value = "/traits", method = RequestMethod.GET)
    public List<Trait> traitList() {
        return traitDao.findAll();
    }

    @RequestMapping(value = "/trait/{id}", method = RequestMethod.GET)
    public Trait getTraits(@PathVariable int id) {
        Trait trait = traitDao.findById(id);

        if (trait == null) throw new NoModelException("No Trait " + id);

        return traitDao.findById(id);
    }

    @PostMapping(value = "/trait")
    public ResponseEntity<Void> addTrait(@RequestBody Trait trait) {
        Trait traitAdded = traitDao.save(trait);
        if (traitAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(traitAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/trait/update")
    public void updateTrait(@RequestBody Trait trait) {
        traitDao.save(trait);
    }
}
