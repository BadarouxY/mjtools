package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.ActionDao;
import com.mjtool.mjtool.model.Action;
import com.mjtool.mjtool.model.Attribute;
import com.mjtool.mjtool.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
public class ActionController {
    @Autowired
    private ActionDao actionDao;

    @PostMapping(value = "/actions")
    public ResponseEntity<Void> addAction(@RequestBody Action action) {
        Action actionAdded = actionDao.save(action);
        if (actionAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(actionAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @RequestMapping(value = "/actions/getbyfight/{id}", method = RequestMethod.GET)
    public List<Action> getActionsByfight(@PathVariable int id) {
        return actionDao.findByFightId(id);
    }
}
