package com.mjtool.mjtool.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mjtool.mjtool.dao.CharacterDao;
import com.mjtool.mjtool.model.Character;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
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

        SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);

        MappingJacksonValue produitsFiltres = new MappingJacksonValue(characters);

        produitsFiltres.setFilters(listDeNosFiltres);

        return produitsFiltres;

    }


    @RequestMapping(value = "/characters/{id}", method = RequestMethod.GET)
    public Character getCharacter(@PathVariable int id) {
        Character charac = characterDao.findById(id);

        if (charac == null) throw new NoModelException("No character " + id);

        return characterDao.findById(id);
    }

    @RequestMapping(value = "/characters/getnpc", method = RequestMethod.GET)
    public List<Character> getNpcCharacter() {
        return characterDao.findByIsNpcTrue();
    }

    @RequestMapping(value = "/characters/getplayable", method = RequestMethod.GET)
    public List<Character> getPlayableCharacter() {
        return characterDao.findByIsNpcFalse();
    }

    @RequestMapping(value = "/characters/player/{playerName}", method = RequestMethod.GET)
    public List<Character> getCharacterByPlayer(@PathVariable String playerName) {
        List<Character> characters = characterDao.findByPlayer(playerName);
        if (characters.size() == 0) {
            throw new NoModelException("No character for the player " + playerName);
        }

        return characterDao.findByPlayer(playerName);
    }

    @PostMapping(value = "/characters")
    public ResponseEntity<Void> addCharacter(@RequestBody Character charac) {
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

    @PutMapping(value = "/characters/update")
    public void updateCharacter(@RequestBody Character charac) {
        characterDao.save(charac);
    }
}
