package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "traits")
public class Traits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
