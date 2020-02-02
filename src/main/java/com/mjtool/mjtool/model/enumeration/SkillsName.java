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
    SURVIE("Survie", "int", ""),
    INTIMIDATION("Intimidation", "F", ""),
    NATATION("Natation", "F", "");

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
