package com.mjtool.mjtool.service;

import com.mjtool.mjtool.dao.CharacterDao;
import com.mjtool.mjtool.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Scope(value = "session")
@Component(value = "characterService")
public class CharacterService {

    @Autowired
    private CharacterDao characterDao;



}
