package com.workintech.models;

public class BedRoom extends Room {
    private String name;
    private Bed bed;
    private Carpet carpet;
    private Wardrobe wardrobe;
    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Carpet carpet, Wardrobe wardrobe) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp);
        this.name = name;
        this.bed = bed;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void createRoom() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "BedRoom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", carpet=" + carpet +
                ", wardrobe=" + wardrobe +
                '}';
    }
}
