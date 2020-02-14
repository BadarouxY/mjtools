package com.mjtool.mjtool.model.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum Birthplaces {
    AVERLAND("Averland"),
    HOCHLAND("Hochland"),
    MIDDENLAND("Middenland"),
    NORDLAND("Nordland"),
    OSTERMARK("Ostermark"),
    OSTLAND("Ostland"),
    REIKLAND("Reikland"),
    STIRLAND("Stirland"),
    TALABECLAND("Talabecland"),
    WISSENLAND("Wissenland"),
    FORET_LAURELORN("Forêt de Laurelorn"),
    GRANDE_FORET("Grande forêt"),
    FORET_REIKWALD("Forêt de Reikwald"),
    KARAK_NORN("Karak Norn"),
    KARAK_IZOR("Karak Izor"),
    KARAK_HIRN("Karak Hirn"),
    KARAK_KADRIN("Karak Kadrin"),
    KARAZ_A_KARAK("Karaz-a-Karak"),
    ZHUFBAR("Zhufbar"),
    BARAK_VARR("Barak Varr"),
    MOOT("Le Moot");

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