package com.mjtool.mjtool.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mjtool.mjtool.model.enumeration.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Enumerated(EnumType.STRING)
    @Column(name = "race")
    private Races races;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Genders genders;
    @Column(name = "age")
    private int age;
    @Enumerated(EnumType.STRING)
    @Column(name = "career")
    private Careers careers;
    @Enumerated(EnumType.STRING)
    @Column(name = "astral_sign")
    private AstralSigns astralSigns;
    @Column(name = "is_a_npc")
    private Boolean isNpc;
    @Column(name = "height")
    private int height;
    @Column(name = "weight")
    private int weight;
    @Column(name = "total_exp")
    private int totalExp;
    @Column(name = "current_exp")
    private int currentExp;
    @Enumerated(EnumType.STRING)
    @Column(name = "hair_color")
    private HairColors hairColor;
    @Enumerated(EnumType.STRING)
    @Column(name = "eyes_color")
    private EyesColors eyeColor;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<DistinctiveSign> distinctiveSigns;
    @Column(name = "number_of_siblings")
    private int NumberOfSiblings;
    @Enumerated(EnumType.STRING)
    @Column(name = "birthplace")
    private Birthplaces birthplace;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "character_id")
    private Collection<Skill> skills;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Trait> traits;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Spell> spells;
    @Column(name = "notes", columnDefinition="text")
    private String notes;
    @Column(name = "stuff", columnDefinition="text")
    private String stuff;
    @OneToMany(mappedBy="character", cascade = CascadeType.ALL)
    private Collection<Attribute> attributes;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Personn player;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "actual_hp")
    private int actualHp;
    @Column(name = "actual_fp")
    private int actualFp;
    @Column(name = "random_fp")
    private int randomFp;



    public int getActualFp() {
        return actualFp;
    }

    public void setActualFp(int actualFp) {
        this.actualFp = actualFp;
    }

    public int getActualHp() {
        return actualHp;
    }

    public void setActualHp(int actualHp) {
        this.actualHp = actualHp;
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

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public Personn getPlayer() {
        return player;
    }

    public void setPlayer(Personn player) {
        this.player = player;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
