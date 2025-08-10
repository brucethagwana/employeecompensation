package com.bruce.thagwana;

public class EmployeeDetails {

    private final String name;
    private final String surname;
    private final String emailAddress;
    private final int employeeID;
    private final String employeeDepartment;

    public EmployeeDetails(String name, String surname, String emailAddress, int employeeID, String employeeDepartment) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.employeeID = employeeID;
        this.employeeDepartment = employeeDepartment;
    }

    public void Name() {
        System.out.println("Name: " + name);
    }

    public void Surname() {
        System.out.println("Surname: " + surname);
    }

    public void EmailAddress() {
        System.out.println("Email Address: " + emailAddress);
    }

    public void EmployeeID() {
        System.out.println("Employee ID: " + employeeID);
    }

    public void EmployeeDepartment() {
        System.out.println("Employee Department: " + employeeDepartment);
    }
}
