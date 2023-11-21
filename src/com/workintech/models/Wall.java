package com.workintech.models;

public class Wall {
    private String  direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void create() {
        System.out.println("Wall is being created");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
