package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
public class Attributes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
