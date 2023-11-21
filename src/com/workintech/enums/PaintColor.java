package com.workintech.enums;

public enum PaintColor {
    BLUE("00f"),
    BLACK("000"),
    GREEN("0f0"),
    WHITE("fff"),
    RED("f00");

    private String hexCode;

    PaintColor(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
