package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "spells")
public class Spells {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
