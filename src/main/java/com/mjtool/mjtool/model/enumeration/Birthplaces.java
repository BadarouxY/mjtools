package com.mjtool.mjtool.model.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum Birthplaces {
    GRENOBLE("Grenoble");

    private String value;
    private String name;

    Birthplaces(String value) {
        this.value = value;
        name = name();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}