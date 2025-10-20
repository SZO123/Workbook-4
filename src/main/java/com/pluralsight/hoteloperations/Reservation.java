package com.pluralsight.hoteloperations;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        double basePrice;
        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124.00;
        } else {
            basePrice = 0.00;
        }

        if (isWeekend) {
            basePrice *= 1.10;
        }

        return basePrice;

    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;

    }
}
