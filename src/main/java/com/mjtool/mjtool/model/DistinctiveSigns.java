package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "distinctive_signs")
public class DistinctiveSigns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
