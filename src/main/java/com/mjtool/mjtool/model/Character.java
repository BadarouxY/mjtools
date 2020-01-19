package com.mjtool.mjtool.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "characters")
//@JsonFilter("monFiltreDynamique")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
