package com.pluralsight.hoteloperations;

import java.time.LocalDateTime;

public class Employee {
    private String name;
    private double basePayRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(String name, double basePayRate, double hoursWorked) {
        this.name = name;
        this.basePayRate = basePayRate;
        this.hoursWorked = hoursWorked;
    }


    public void punchIn(double time) {
        punchInTime = time;
        System.out.println(name + " punched in at " + time);
    }

    public void punchOut(double time) {
        double hours = time - punchInTime;
        hoursWorked += hours;
        System.out.println(name + " punched out at " + time + " (worked " + hours + " hours).");
    }


    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchInTime = time;
        System.out.printf("%s punched in at %.2f (system time)%n", name, time);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        double hours = time - punchInTime;
        hoursWorked += hours;
        System.out.printf("%s punched out at %.2f (worked %.2f hours)%n", name, time, hours);
    }


    public double getTotalPay() {
        double overtime = 0;
        double regular = hoursWorked;

        if (hoursWorked > 40) {
            overtime = hoursWorked - 40;
            regular = 40;
        }

        return (regular * basePayRate) + (overtime * basePayRate * 1.5);
    }

    public String getName() { return name; }
    public double getHoursWorked() { return hoursWorked; }
}