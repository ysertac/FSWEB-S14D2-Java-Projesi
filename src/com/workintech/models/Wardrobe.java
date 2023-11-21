package com.workintech.models;

public class Wardrobe {

    int height;
    int width;
    double weight;

    public Wardrobe(int height, int width, double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public void add() {
        System.out.println("Wardrobe added into the bedroom");
        System.out.println(height);
        System.out.println(width);
        System.out.println(weight);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height = " + height +
                ", width = " + width +
                ", weight = " + weight +
                '}';
    }
}
