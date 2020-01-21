package com.mjtool.mjtool.model;

import com.mjtool.mjtool.model.enumeration.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Enumerated(EnumType.STRING)
    @Column(name = "race", nullable = false)
    private Race race;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;
    @Column(name = "age", nullable = false)
    private int age;
    @OneToOne
    private Career career;
    @Enumerated(EnumType.STRING)
    @Column(name = "astral_signe", nullable = false)
    private AstralSign astralSign;
    @Column(name = "is_a_npc", nullable = false)
    private Boolean isNpc;
    @Column(name = "height", nullable = false)
    private int height;
    @Column(name = "weight", nullable = false)
    private int weight;
    @Column(name = "exp")
    private int exp;
    @Enumerated(EnumType.STRING)
    @Column(name = "hair_color", nullable = false)
    private HairColors hairColor;
    @Enumerated(EnumType.STRING)
    @Column(name = "eyes_color", nullable = false)
    private EyesColors eyeColor;
    @OneToMany(mappedBy="character")
    private Collection<DistinctiveSigns> distinctiveSigns;
    @Column(name = "number_of_siblings")
    private int NumberOfSiblings;
    @Enumerated(EnumType.STRING)
    @Column(name = "birthplace", nullable = false)
    private Birthplaces birthplace;
    @OneToMany(mappedBy="character")
    private Collection<Skills> skills;
    @OneToMany(mappedBy="character")
    private Collection<Traits> traits;
    @OneToMany(mappedBy="character")
    private Collection<Spells> spells;
    @Column(name = "notes", columnDefinition="text")
    private String notes;
    @OneToMany(mappedBy="character")
    private Collection<Attributes> attributes;


    public Character(String name) {
        this.name = name;
    }

    public Character(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Collection<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(Collection<Attributes> attributes) {
        this.attributes = attributes;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Collection<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Collection<Skills> skills) {
        this.skills = skills;
    }

    public Collection<Traits> getTraits() {
        return traits;
    }

    public void setTraits(Collection<Traits> traits) {
        this.traits = traits;
    }

    public Collection<Spells> getSpells() {
        return spells;
    }

    public void setSpells(Collection<Spells> spells) {
        this.spells = spells;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public AstralSign getAstralSign() {
        return astralSign;
    }

    public void setAstralSign(AstralSign astralSign) {
        this.astralSign = astralSign;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public HairColors getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColors hairColor) {
        this.hairColor = hairColor;
    }

    public EyesColors getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyesColors eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Boolean getNpc() {
        return isNpc;
    }

    public void setNpc(Boolean npc) {
        isNpc = npc;
    }

    public Collection<DistinctiveSigns> getDistinctiveSigns() {
        return distinctiveSigns;
    }

    public void setDistinctiveSigns(Collection<DistinctiveSigns> distinctiveSigns) {
        this.distinctiveSigns = distinctiveSigns;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getNumberOfSiblings() {
        return NumberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        NumberOfSiblings = numberOfSiblings;
    }

    public Birthplaces getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Birthplaces birthplace) {
        this.birthplace = birthplace;
    }


    public Character(int id, String name, String surname, Race race, Gender gender, int age,
                     Career career, AstralSign astralSign, Boolean isNpc, int height, int weight, int exp,
                     HairColors hairColor, EyesColors eyeColor, Collection<DistinctiveSigns> distinctiveSigns,
                     int numberOfSiblings, Birthplaces birthplace, Collection<Skills> skills, Collection<Traits> traits,
                     Collection<Spells> spells, String notes) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.career = career;
        this.astralSign = astralSign;
        this.isNpc = isNpc;
        this.height = height;
        this.weight = weight;
        this.exp = exp;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.distinctiveSigns = distinctiveSigns;
        this.birthplace = birthplace;
        this.skills = skills;
        this.traits = traits;
        this.spells = spells;
        this.notes = notes;
    }

    public Character() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
