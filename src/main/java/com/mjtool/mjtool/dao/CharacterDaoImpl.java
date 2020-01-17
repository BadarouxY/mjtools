package com.mjtool.mjtool.dao;

import com.mjtool.mjtool.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao {
    public static List<Character>Characters = new ArrayList<>();

    static {
        Characters.add(new Character(1, "toto1",450 ));
        Characters.add(new Character(2, "toto2", 500 ));
        Characters.add(new Character(3, "toto3", 600 ));

    }

    @Override
    public List<Character> findAll() {
        return Characters;
    }

    @Override
    public Character findById(int id) {
        for (Character Character : Characters) {
            if(Character.getId() ==id){
                return Character;
            }
        }
        return null;
    }

    @Override
    public Character save(Character character) {
        Characters.add(character);
        return character;
    }


}
