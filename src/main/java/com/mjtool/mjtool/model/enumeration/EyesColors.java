package com.mjtool.mjtool.model.enumeration;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum EyesColors {
    BLEUS("Bleus"),
    GRIS_BLEUS("Gris-bleu"),
    VERT("Vert"),
    CUIVRE("Cuivre"),
    MARRON_CLAIR("Marron clair"),
    MARRON("Marron"),
    MARRON_FONCE("Marron foncé"),
    ARGENT("Argent"),
    MAUVE("Mauve"),
    NOIR("Noir"),
    NOISETTE("Noisette"),
    GRIS_CLAIR("Gris clair");




    private String value;
    private String name;

    EyesColors(String value) {
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
