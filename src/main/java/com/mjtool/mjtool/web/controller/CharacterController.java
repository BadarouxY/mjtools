package com.mjtool.mjtool.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mjtool.mjtool.dao.CharacterDao;
import com.mjtool.mjtool.model.Character;
import com.mjtool.mjtool.web.exceptions.NoCharacterException;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin
@RestController
public class CharacterController {

    @Autowired
    private CharacterDao characterDao;

    @RequestMapping(value="/characters", method = RequestMethod.GET)
    public MappingJacksonValue characterList() {
        Iterable<Character> characters = characterDao.findAll();

        SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("prixAchat");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);

        MappingJacksonValue produitsFiltres = new MappingJacksonValue(characters);

        produitsFiltres.setFilters(listDeNosFiltres);

        return produitsFiltres;

    }


    @RequestMapping(value = "/characters/{id}", method = RequestMethod.GET)
    public Character getCharacter(@PathVariable int id) {
        Character charac = characterDao.findById(id);

        if (charac == null) throw new NoCharacterException("No character " + id);

        return characterDao.findById(id);
    }

    @PostMapping(value = "/characters")
    public ResponseEntity<Void> addCharacter(@RequestBody Character charac) {
        System.out.println(charac);
        Character characterAdded = characterDao.save(charac);


        if (characterAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(characterAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }
}
