package com.mjtool.mjtool.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mjtool.mjtool.dao.SpellDao;
import com.mjtool.mjtool.model.Spell;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;


import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin
@RestController
public class SpellController {

    @Autowired
    private SpellDao spellDao;

    @RequestMapping(value="/spells", method = RequestMethod.GET)
    public MappingJacksonValue spellList() {
        Iterable<Spell> spell = spellDao.findAll();

        SimpleBeanPropertyFilter myFilter = SimpleBeanPropertyFilter.serializeAllExcept("");

        FilterProvider filterList = new SimpleFilterProvider().addFilter("myFilter", myFilter);

        MappingJacksonValue filteredAttributes = new MappingJacksonValue(spell);

        filteredAttributes.setFilters(filterList);

        return filteredAttributes;

    }

    @RequestMapping(value = "/spells/{id}", method = RequestMethod.GET)
    public Spell getSpell(@PathVariable int id) {
        Spell spell = spellDao.findById(id);

        if (spell == null) throw new NoModelException("No Spell " + id);

        return spellDao.findById(id);
    }


    @PostMapping(value = "/spells")
    public ResponseEntity<Void> addSpell(@RequestBody Spell spell) {
        Spell spellAdded = spellDao.save(spell);
        if (spellAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(spellAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/spells/update")
    public void updateSpell(@RequestBody Spell spell) {
        spellDao.save(spell);
    }
}
