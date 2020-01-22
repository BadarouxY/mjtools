package com.mjtool.mjtool.model.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum Careers {

    SERGENT("Sergent", false, true),
    ASSASSIN("Assassin",false, true);
    private String name;
    private Boolean isBasic;
    private Boolean isAdvanced;
    private String value;

    Careers(String value, Boolean isBasic, Boolean isAdvanced) {
        this.isBasic = isBasic;
        this.isAdvanced = isAdvanced;
        this.value = value;
        name = name();
    }
@JsonValue
    public static Careers[] getCareers() {
        return Careers.values();
    }

    public Boolean getBasic() {
        return isBasic;
    }

    public void setBasic(Boolean basic) {
        isBasic = basic;
    }

    public Boolean getAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(Boolean advanced) {
        isAdvanced = advanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
