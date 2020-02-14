package com.mjtool.mjtool.model.enumeration;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum SkillsName {
    //page 91 manuel
    CANOTAGE("Canotage", "F", ""),
    CHARISME("Charisme", "Soc", ""),
    COMMANDEMENT("Commandement", "Soc","" ),
    COMMERAGE("Commérage", "Soc", ""),
    CONDUITE_ATTELAGES("Conduite_attelages", "F", ""),
    DEGUISEMENT("Déguisement", "Soc", ""),
    DEPLACEMENT_SILENCIEUX("Déplacement_silencieux", "Ag", ""),
    DISSIMULATION("Dissimulation", "Ag", ""),
    EQUITATION("Equitation", "Ag", ""),
    ESCALADE("Escalade", "F", ""),
    EVALUATION("Evaluation", "Int", ""),
    FOUILLE("Fouille", "Int", ""),
    INTIMIDATION("Intimidation", "F", ""),
    JEU("Jeu", "Int", ""),
    MARCHANDAGE("Marchandage", "Soc", ""),
    NATATION("Natation", "F", ""),
    PERCEPTION("Perception", "Int", ""),
    RESISTANCE_ALCOOL("Résistance_alcool", "E", ""),
    SOIN_ANIMAUX("Soin_animaux", "Int", ""),
    SURVIE("Survie", "Int", ""),
    ALPHABET_SECRET("Alphabet_secret", "Int", ""),
    BARATIN("Baratin", "Soc", ""),
    BRACONNAGE("Braconnage", "Ag", ""),
    CONNAISSANCES_ACADEMIQUES("Connaissances_académiques", "Int", ""),
    CONNNAISSANCES_GENERALES("Connaissances_générales", "Int", ""),
    CROCHETAGE("Crochetage", "Ag", ""),
    DRESSAGE("Dressage", "Soc", ""),
    EMPRISE_ANIMAUX("Emprise_animaux", "Soc", ""),
    ESCAMOTAGE("Escamotage", "Ag", ""),
    ESQUIVE("Esquive", "Ag", ""),
    EXPRESSION_ARTISTIQUE("Expression_artistique", "Soc", ""),
    FILATURE("Filature", "Ag", ""),
    FOCALISATION("Focalisation", "FM", ""),
    HYPNOTISME("Hypnotisme", "FM", ""),
    LANGAGE_MYSTIQUE("Langage_mystique", "Int", ""),
    LANGAGE_SECRET("Langage_secret", "Int", ""),
    LECTURE_LEVRES("Lecture_lèvres", "Int", ""),
    LIRE_ECRIRE("Lire_écrire", "Int", ""),
    NAVIGATION("Navigation", "Ag", ""),
    ORIENTATION("Orientation", "Int", ""),
    PISTAGE("Pistage", "Int", ""),
    PREPARATION_POISONS("Préparation_poisons", "Int", ""),
    SENS_MAGIE("Sens_magie", "FM", ""),
    SOINS("Soins", "Int", ""),
    TORTURE("Torture", "Soc", ""),
    VENTRILOQUIE("Ventriloquie", "Soc", "");


    private String value;
    private String associatedAttribute;
    private String name;
    private String description;

    SkillsName(String value, String associatedAttribute, String description) {
        this.value = value;
        this.associatedAttribute = associatedAttribute;
        this.description = description;
        name = name();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAssociatedAttribute() {
        return associatedAttribute;
    }

    public void setAssociatedAttribute(String associatedAttribute) {
        this.associatedAttribute = associatedAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
