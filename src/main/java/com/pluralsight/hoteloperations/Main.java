package com.pluralsight.hoteloperations;

public class Main {
    public static void main(String[] args) {


        Room room1 = new Room(2, false, false, 150.0);
        System.out.println("Room available: " + room1.isAvailable());

        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();
        System.out.println("Room available after cleaning: " + room1.isAvailable());


        Reservation res1 = new Reservation("king", true, 3);
        System.out.printf("Reservation total: $%.2f%n", res1.getReservationTotal());


        Employee emp1 = new Employee("Najib", 45, 20.0 );
        System.out.println("Employee total pay:  $" + emp1.getTotalPay());

        emp1.punchIn(10.0);
        emp1.punchOut(14.75);
        emp1.punchIn(15.25);
        emp1.punchOut(18.0);


        Hotel hotel = new Hotel("BlueSky Inn", 5, 10);
        System.out.println("\nAvailable suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());

        hotel.bookRoom(2, true);
        hotel.bookRoom(3, false);

        System.out.println("Suites left: " + hotel.getAvailableSuites());
        System.out.println("Rooms left: " + hotel.getAvailableRooms());
    }
}


