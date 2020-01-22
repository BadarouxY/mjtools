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
    private Races races;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Genders genders;
    @Column(name = "age", nullable = false)
    private int age;
    @Enumerated(EnumType.STRING)
    @Column(name = "career", nullable = false)
    private Careers careers;
    @Enumerated(EnumType.STRING)
    @Column(name = "astral_sign", nullable = false)
    private AstralSigns astralSigns;
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
    private Collection<DistinctiveSign> distinctiveSigns;
    @Column(name = "number_of_siblings")
    private int NumberOfSiblings;
    @Enumerated(EnumType.STRING)
    @Column(name = "birthplace", nullable = false)
    private Birthplaces birthplace;
    @OneToMany(mappedBy="character")
    private Collection<Skill> skills;
    @OneToMany(mappedBy="character")
    private Collection<Trait> traits;
    @OneToMany(mappedBy="character")
    private Collection<Spell> spells;
    @Column(name = "notes", columnDefinition="text")
    private String notes;
    @OneToMany(mappedBy="character")
    private Collection<Attribute> attributes;


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

    public Races getRaces() {
        return races;
    }

    public void setRaces(Races races) {
        this.races = races;
    }

    public Collection<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Collection<Attribute> attributes) {
        this.attributes = attributes;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Collection<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Collection<Skill> skills) {
        this.skills = skills;
    }

    public Collection<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Collection<Trait> traits) {
        this.traits = traits;
    }

    public Collection<Spell> getSpells() {
        return spells;
    }

    public void setSpells(Collection<Spell> spells) {
        this.spells = spells;
    }

    public Genders getGenders() {
        return genders;
    }

    public void setGenders(Genders genders) {
        this.genders = genders;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Careers getCareers() {
        return careers;
    }

    public void setCareers(Careers careers) {
        this.careers = careers;
    }

    public AstralSigns getAstralSigns() {
        return astralSigns;
    }

    public void setAstralSigns(AstralSigns astralSigns) {
        this.astralSigns = astralSigns;
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

    public Collection<DistinctiveSign> getDistinctiveSigns() {
        return distinctiveSigns;
    }

    public void setDistinctiveSigns(Collection<DistinctiveSign> distinctiveSigns) {
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


    public Character(int id, String name, String surname, Races races, Genders genders, int age,
                     Careers careers, AstralSigns astralSigns, Boolean isNpc, int height, int weight, int exp,
                     HairColors hairColor, EyesColors eyeColor, Collection<DistinctiveSign> distinctiveSigns,
                     int numberOfSiblings, Birthplaces birthplace, Collection<Skill> skills, Collection<Trait> traits,
                     Collection<Spell> spells, String notes) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.races = races;
        this.genders = genders;
        this.age = age;
        this.careers = careers;
        this.astralSigns = astralSigns;
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
