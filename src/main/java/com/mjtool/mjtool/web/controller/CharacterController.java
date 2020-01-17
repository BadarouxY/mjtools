package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.CharacterDao;
import com.mjtool.mjtool.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
public class CharacterController {

    @Autowired
    private CharacterDao characterDao;

    @RequestMapping(value="/characters", method = RequestMethod.GET)
    public List<Character> characterList() {
        return characterDao.findAll();
    }

    @RequestMapping(value = "/characters/{id}", method = RequestMethod.GET)
    public Character getCharacter(@PathVariable int id) {

        Character charac = new Character(1, "toto" );
        return characterDao.findById(id);
    }

    @PostMapping(value = "/characters")
    public ResponseEntity<Void> ajouterCharacter(@RequestBody Character charac) {
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
