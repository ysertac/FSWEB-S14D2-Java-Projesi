package com.workintech.models;

public class Bed {
    String style;
    int pillows;
    int height;
    int sheets;
    int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println(style + " bed is being made");
        System.out.println(getStyle());
        System.out.println(getHeight());
        System.out.println(getPillows());
        System.out.println(getSheets());
        System.out.println(getQuilt());
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}
