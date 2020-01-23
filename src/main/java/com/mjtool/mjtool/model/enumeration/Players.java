package com.mjtool.mjtool.model.enumeration;

public enum Players {
    YANNICK("Yannick"),
    MICKEY("Mickey"),
    GREG("Greg"),
    ROUX("Roux");

    private String name;
    Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
