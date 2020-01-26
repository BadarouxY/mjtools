package com.mjtool.mjtool.model.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum Birthplaces {
    GRENOBLE("Grenoble");

    private String value;

    Birthplaces(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}