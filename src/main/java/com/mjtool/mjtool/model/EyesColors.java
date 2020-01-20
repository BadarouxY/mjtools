package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "eyes_colors")
public class EyesColors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "color", nullable = false)
    private String color;
}
