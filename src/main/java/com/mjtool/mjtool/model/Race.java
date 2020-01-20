package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "race")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "race", nullable = false)
    private String race;
}
