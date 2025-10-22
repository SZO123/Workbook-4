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

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in successfully.");
        } else {
            System.out.println("Room not available for check-in!");
        }
    }


    public void checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Room needs cleaning.");
        } else {
            System.out.println("No guest to check out.");
        }
    }

    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room has been cleaned and is ready for new guests.");
        } else {
            System.out.println("Room is already clean.");
        }

    }
}
