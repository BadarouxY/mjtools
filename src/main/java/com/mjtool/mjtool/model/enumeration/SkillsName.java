package com.mjtool.mjtool.model.enumeration;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum SkillsName {
    SURVIE("Survie", "int"), INTIMIDATION("Intimidation", "F");

    private String value;
    private String associatedAttribute;

    SkillsName(String value, String associatedAttribute) {
        this.value = value;
        this.associatedAttribute = associatedAttribute;
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
}
