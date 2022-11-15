package com.bruce.thagwana;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        EmployeeDetails employeeDetails = new EmployeeDetails("######", "##########", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        Benefits rewards = new Benefits(288000, 0, 216, 100000, 8000000, 216, 15000000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600,
                500, 500, 2000, 1500, 500, 15000, null, null);
        Benefits aid = new Benefits(288000, 0, 216, 100000, 8000000, 216, 1500000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                2000, 2000, 1500, 500, 15000, null, null);
        Benefits acquire = new Benefits(288000, 0, 216, 100000, 8000000, 216, 1500000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, null, null);

        Balance equaliser = new Balance(288000, rewards);
        Balance equate = new Balance(288000, rewards);
        Balance proportion = new Balance(288000, rewards);
        Balance symmetry = new Balance(288000, rewards);

        MonthsOfTheYear planetaryMonth = new MonthsOfTheYear(false, 2021, "00:00", null);

        Benefits remuneration = new Benefits(288000, 0, 216, 100000, 8000000, 216, 1500000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600,
                500, 500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);
        Benefits profits = new Benefits(288000, 0, 216, 100000, 8000000, 216, 1500000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);
        Benefits benefits = new Benefits(288000, 0, 216, 100000, 8000000, 216, 1500000, 5500000, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);

        MonthsOfTheYear subSynodicMonth = new MonthsOfTheYear(false, 2021, "00:00", remuneration);
        MonthsOfTheYear solarMonth = new MonthsOfTheYear(false, 2021, "00:00", remuneration);
        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(false, 2021, "00:00", remuneration);

        OtherDeductions gains = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);
        OtherDeductions otherDeductions = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);

        Deductions welfare = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);
        Deductions deductions = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);

        Assets assets = new Assets(profits, welfare, gains, equate);

        Balance balance = new Balance(288000, rewards);

        EmployeeInfo employeeInfo = new EmployeeInfo(benefits, balance, deductions, otherDeductions, employeeDetails, monthsOfTheYear, assets);

        System.out.println("--------------------------------------Employee Details-------------------------------------");
        employeeInfo.getEmployeeDetails().Name();
        employeeInfo.getEmployeeDetails().Surname();
        employeeInfo.getEmployeeDetails().EmailAddress();
        employeeInfo.getEmployeeDetails().EmployeeID();
        employeeInfo.getEmployeeDetails().EmployeeDepartment();
        System.out.println("\t");
        System.out.println("---------------------------------------Date and Time---------------------------------------");
        employeeInfo.getMonthsOfTheYear().setCurrentMonth();
        employeeInfo.getMonthsOfTheYear().setPlanetaryDay();
        employeeInfo.getMonthsOfTheYear().setPayDay();
        employeeInfo.getMonthsOfTheYear().printTimeAndDate(monthsOfTheYear.getDayOfTheWeek(), monthsOfTheYear.getMonths(),
                monthsOfTheYear.getPayDay(), "Wednesday", "August", 24);
        System.out.println("\t");
        System.out.println("------------------------------Employee Balance Before Deductions---------------------------");
        employeeInfo.getBenefits().salary();
        employeeInfo.getMonthsOfTheYear().printCurrentMonth(monthsOfTheYear.getMonths(), "August");
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------");
        employeeInfo.getMonthsOfTheYear().salaryWithBonus(monthsOfTheYear.getMonths(), "August");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------Employee Deductions---------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().setAttainedInterest();
        employeeInfo.getAssets().accessionOne(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------------------");
        employeeInfo.getAssets().aggregateOne(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("---------------------------------Mandatory Deductions--------------------------------------");
        employeeInfo.getDeductions().getSolarMonth().setCurrentMonth();
        employeeInfo.getOtherDeductions().getSubSynodicMonth().setCurrentMonth();
        employeeInfo.getDeductions().synthesisOne("August");
        employeeInfo.getOtherDeductions().synthesisTwo("August");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------Employee Insurance--------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionTwo(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        employeeInfo.getAssets().aggregateTwo(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("---------------------------------Optional Contributions------------------------------------");
        employeeInfo.getBenefits().getPlanetaryMonth().setCurrentMonth();
        employeeInfo.getBenefits().synthesisThree("August");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------Company Contributions------------------------------------");
        System.out.println("------Company Benefits------");
        employeeInfo.getBenefits().houseAllowance();
        employeeInfo.getBenefits().studyFeesAllowance();
        employeeInfo.getBenefits().petrolAllowance();
        employeeInfo.getBenefits().otherAllowances();
        System.out.println("\t");
        try {
            employeeInfo.getBenefits().requisition();
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e);
            System.out.println("Ineffective operation. Beware of the bullies, Goodbye!!!.");
            System.out.println("Salary has been deposited into your account. Thank you for your service.");
        }
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("--------------Requisitions--------------");
        employeeInfo.getBenefits().finalRequisition();
        System.out.println("\t");
        employeeInfo.getBalance().setSalaryRange();
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------");
        if(employeeInfo.getBalance().getAvailableBalance() == rewards.getSalary() + rewards.getBonus()) {
            employeeInfo.getBalance().printDeductedSalaryAmount();
        } else {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Nix.");
        }
        System.out.println("===========================================================================================");
    }
}
