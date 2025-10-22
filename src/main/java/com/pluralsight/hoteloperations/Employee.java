package com.pluralsight.hoteloperations;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double startTime;

    public Employee(int employeeId, double hoursWorked, double payRate, String name, String department) {
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getRegularHours() {
        return Math.max(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }


    public void punchIn(double time) {
        if (startTime != null) {
            System.out.println(name + " is already punched in!");
        } else {
            startTime = time;
            System.out.println(name + " punched in at " + time);
        }
    }


    public void punchOut(double time) {
        if (startTime == null) {
            System.out.println(name + " must punch in first!");
        } else if (time < startTime) {
            System.out.println("Invalid time — punch-out must be after punch-in.");
        } else {
            double worked = time - startTime;
            hoursWorked += worked;
            System.out.println(name + " punched out at " + time + " (worked " + worked + " hours).");
            startTime = null;
        }
    }
}