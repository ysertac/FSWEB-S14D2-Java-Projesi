package com.workintech.models;

import com.workintech.enums.PaintColor;

public class Ceiling {
    int height;
    PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", color=" + color +
                '}';
    }
}
