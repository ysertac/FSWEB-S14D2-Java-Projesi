package com.workintech.models;

import com.workintech.enums.PaintColor;

public class Carpet {
    int width;
    int height;
    PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying()  {
        System.out.println("Carpet is lying");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width = " + width +
                ", height = " + height +
                ", color = " + color +
                '}';
    }
}
