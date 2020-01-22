package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.dao.SkillDao;
import com.mjtool.mjtool.model.Skill;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SkillController {
    @Autowired
    private SkillDao skillDao;

    @RequestMapping(value = "/skills", method = RequestMethod.GET)
    public List<Skill> skillsList() {
        return skillDao.findAll();
    }

    @RequestMapping(value = "/skills/{id}", method = RequestMethod.GET)
    public Skill getSkills(@PathVariable int id) {
        Skill skill = skillDao.findById(id);

        if (skill == null) throw new NoModelException("No Skill " + id);

        return skillDao.findById(id);
    }

    @PostMapping(value = "/skills")
    public ResponseEntity<Void> addSkill(@RequestBody Skill skill) {
        Skill skillAdded = skillDao.save(skill);
        if (skillAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(skillAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/skills/update")
    public void updateSkill(@RequestBody Skill skill) {
        skillDao.save(skill);
    }
}
