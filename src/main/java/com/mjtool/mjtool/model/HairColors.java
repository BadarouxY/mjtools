package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "hair_colors")
public class HairColors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "color", nullable = false)
    private String color;
}
