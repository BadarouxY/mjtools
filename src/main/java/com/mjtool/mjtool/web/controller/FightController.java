package com.mjtool.mjtool.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mjtool.mjtool.dao.FightDao;
import com.mjtool.mjtool.model.Fight;
import com.mjtool.mjtool.model.Fight;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin
@RestController
public class FightController {
    
    @Autowired
    private FightDao fightDao;

    @RequestMapping(value="/fights", method = RequestMethod.GET)
    public MappingJacksonValue fightList() {
        Iterable<Fight> fight = fightDao.findAll();

        SimpleBeanPropertyFilter myFilter = SimpleBeanPropertyFilter.serializeAllExcept("");

        FilterProvider filterList = new SimpleFilterProvider().addFilter("myFilter", myFilter);

        MappingJacksonValue filteredAttributes = new MappingJacksonValue(fight);

        filteredAttributes.setFilters(filterList);

        return filteredAttributes;
    }

    @RequestMapping(value = "/fights/{id}", method = RequestMethod.GET)
    public Fight getFight(@PathVariable int id) {
        Fight fight = fightDao.findById(id);

        if (fight == null) throw new NoModelException("No Fight " + id);

        return fightDao.findById(id);
    }

    @RequestMapping(value = "/fights/inprogress", method = RequestMethod.GET)
    public Iterable<Fight> getFightInProgress() {

        return fightDao.findByIsEndedFalse();
    }

    @PostMapping(value = "/fights")
    public ResponseEntity<Void> addFight(@RequestBody Fight fight) {
        Fight fightAdded = fightDao.save(fight);
        if (fightAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(fightAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/fights/update")
    public void updateAFight(@RequestBody Fight fight) {
        fightDao.save(fight);
    }


}
