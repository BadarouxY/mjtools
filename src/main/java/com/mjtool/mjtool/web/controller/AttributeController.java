package com.mjtool.mjtool.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mjtool.mjtool.dao.AttributeDao;
import com.mjtool.mjtool.model.Attribute;
import com.mjtool.mjtool.web.exceptions.NoModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;


import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin
@RestController
public class AttributeController {

    @Autowired
    private AttributeDao attributeDao;

    @RequestMapping(value="/attributes", method = RequestMethod.GET)
    public MappingJacksonValue attributesList() {
        Iterable<Attribute> attribute = attributeDao.findAll();

        SimpleBeanPropertyFilter myFilter = SimpleBeanPropertyFilter.serializeAllExcept("");

        FilterProvider filterList = new SimpleFilterProvider().addFilter("myFilter", myFilter);

        MappingJacksonValue filteredAttributes = new MappingJacksonValue(attribute);

        filteredAttributes.setFilters(filterList);

        return filteredAttributes;

    }

    @RequestMapping(value = "/attributes/{id}", method = RequestMethod.GET)
    public Attribute getAttribute(@PathVariable int id) {
        Attribute attribute = attributeDao.findById(id);

        if (attribute == null) throw new NoModelException("No Attribute " + id);

        return attributeDao.findById(id);
    }


    @PostMapping(value = "/attributes")
    public ResponseEntity<Void> addAttribute(@RequestBody Attribute attribute) {
        Attribute attributeAdded = attributeDao.save(attribute);
        if (attributeAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(attributeAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping(value = "/attributes/update")
    public void updateAttribute(@RequestBody Attribute attribute) {
        attributeDao.save(attribute);
    }
}
