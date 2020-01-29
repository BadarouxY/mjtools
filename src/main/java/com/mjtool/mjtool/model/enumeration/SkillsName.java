package com.mjtool.mjtool.model.enumeration;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum SkillsName {
    SURVIE("Survie", "int", "permet de survivre"),
    INTIMIDATION("Intimidation", "F", "permet d'intimider"),
    NATATION("Natation", "F", "Permet de nager");

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
