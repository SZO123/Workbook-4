package com.pluralsight.hoteloperations;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, boolean dirty, boolean occupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.dirty = dirty;
        this.occupied = occupied;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

}
