package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "birtplace")
public class Birthplaces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "place", nullable = false)
    private String place;
}