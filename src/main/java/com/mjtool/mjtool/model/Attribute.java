package com.mjtool.mjtool.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @ManyToOne
    private Character character;
    @Column(name = "name")
    private String name;
    @Column(name = "basic_value")
    private int basicValue;
    @Column(name = "career_potential")
    private int careerPotential;
    @Column(name = "choosen_value")
    private int choosenValue;

    public Attribute() {
    }

    public int getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(int basicValue) {
        this.basicValue = basicValue;
    }

    public int getCareerPotential() {
        return careerPotential;
    }

    public void setCareerPotential(int careerPotential) {
        this.careerPotential = careerPotential;
    }

    public int getChoosenValue() {
        return choosenValue;
    }

    public void setChoosenValue(int choosenValue) {
        this.choosenValue = choosenValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
