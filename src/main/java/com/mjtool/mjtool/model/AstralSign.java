package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "astral_sign")
public class AstralSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "sign", nullable = false)
    private String sign;
}
