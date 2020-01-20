package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "career")
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Boolean advanced;
}
