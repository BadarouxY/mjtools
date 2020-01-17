package com.mjtool.mjtool.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    @JsonIgnore
    private int exp;

    public int getExp() {
        return exp;
    }

    public Character(int id, String nom, int exp) {
        this.id = id;
        this.nom = nom;
        this.exp = exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Character(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
