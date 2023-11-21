package com.workintech.models;

import com.workintech.enums.LampType;

public class Lamp {

    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(int globRating, boolean battery, LampType style) {
        this.globRating = globRating;
        this.battery = battery;
        this.style = style;
    }

    public void turnOn() {
        System.out.println(style + " lamp is being turned on");
        System.out.println(getStyle());
        System.out.println(getGlobRating());
        System.out.println(isBattery());
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
