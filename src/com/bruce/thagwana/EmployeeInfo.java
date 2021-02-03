package com.bruce.thagwana;


public class EmployeeInfo {

    private final Benefits benefits;
    private final Balance balance;
    private final Deductions deductions;
    private final OtherDeductions otherDeductions;
    private final EmployeeDetails employeeDetails;
    private final MonthsOfTheYear monthsOfTheYear;

    public EmployeeInfo(Benefits benefits, Balance balance, Deductions deductions, OtherDeductions otherDeductions,
                        EmployeeDetails employeeDetails, MonthsOfTheYear monthsOfTheYear) {
        this.benefits = benefits;
        this.balance = balance;
        this.deductions = deductions;
        this.otherDeductions = otherDeductions;
        this.employeeDetails = employeeDetails;
        this.monthsOfTheYear = monthsOfTheYear;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public Balance getBalance() {
        return balance;
    }

    public Deductions getDeductions() {
        return deductions;
    }

    public OtherDeductions getOtherDeductions() {
        return otherDeductions;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public MonthsOfTheYear getMonthsOfTheYear() {
        return monthsOfTheYear;
    }
}
