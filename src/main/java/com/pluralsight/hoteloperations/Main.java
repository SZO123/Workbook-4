package com.pluralsight.hoteloperations;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, false, false, 150.0);
        System.out.println("Room available: " + room1.isAvailable());

        Reservation res1 = new Reservation("king", true, 3);
        System.out.printf("Reservation total: $%.2f%n", res1.getReservationTotal());

        Employee emp1 = new Employee(101, 45, 20.0, "Najib", "Front Desk");
        System.out.println("Employee total pay:  $" + emp1.getTotalPay());
    }

}
