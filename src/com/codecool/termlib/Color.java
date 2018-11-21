package com.codecool.termlib;

public enum Color {
    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    MAGENTA(35),
    CYAN(36),
    WHITE(37);

    private final String colorCode;
    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColor(Color color) {return this.colorCode;}
}
