package com.bruce.thagwana;

public class  EmployeeInfo {

    private final Benefits benefits;
    private final Balance balance;
    private final Deductions deductions;
    private final OtherDeductions otherDeductions;
    private final EmployeeDetails employeeDetails;
    boolean onDuty;
    boolean offDuty;
    private final MonthsOfTheYear monthsOfTheYear;
    private final Assets assets;

    public EmployeeInfo(Benefits benefits, Balance balance, Deductions deductions, OtherDeductions otherDeductions,
                        EmployeeDetails employeeDetails, boolean onDuty, boolean offDuty, MonthsOfTheYear monthsOfTheYear, Assets assets) {
        this.benefits = benefits;
        this.balance = balance;
        this.deductions = deductions;
        this.otherDeductions = otherDeductions;
        this.employeeDetails = employeeDetails;
        this.onDuty = onDuty;
        this.offDuty = offDuty;
        this.monthsOfTheYear = monthsOfTheYear;
        this.assets = assets;
    }

    public void attendanceRegister() {
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

    public boolean isOnDuty() {
        return onDuty;
    }

    public boolean isOffDuty() {
        return offDuty;
    }

    public MonthsOfTheYear getMonthsOfTheYear() {
        return monthsOfTheYear;
    }

    public Assets getAssets() {
        return assets;
    }
}
