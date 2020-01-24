package com.mjtool.mjtool.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "personns")
public class Personn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "mail", nullable = false)
    private String mail;
    @Column(name = "password", nullable = false)
    private String password;
}
