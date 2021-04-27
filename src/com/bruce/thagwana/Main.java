package com.bruce.thagwana;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        EmployeeDetails employeeDetails = new EmployeeDetails("######", "##########", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        Benefits rewards = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 15000000, 5500000, null, null);
        Benefits aid = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 1500000, 5500000, null, null);
        Benefits acquire = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 1500000, 5500000, null, null);

        Balance equaliser = new Balance(576000, rewards);
        Balance equate = new Balance(576000, rewards);
        Balance proportion = new Balance(576000, rewards);
        Balance symmetry = new Balance(576000, rewards);

        MonthsOfTheYear planetaryMonth = new MonthsOfTheYear(false, 2021, "00:00", null);

        Benefits remuneration = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 1500000, 5500000, planetaryMonth, equaliser);
        Benefits profits = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 1500000, 5500000, planetaryMonth, equaliser);
        Benefits benefits = new Benefits(288000, 288000, 216, 100000, 8000000, 216, 1500000, 5500000, planetaryMonth, equaliser);

        MonthsOfTheYear subSynodicMonth = new MonthsOfTheYear(false, 2021, "00:00", remuneration);
        MonthsOfTheYear solarMonth = new MonthsOfTheYear(false, 2021, "00:00", remuneration);
        MonthsOfTheYear timeUnit = new MonthsOfTheYear(false, 2021, "00:00", remuneration);
        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(false, 2021, "00:00", remuneration);

        OtherDeductions gains = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);
        OtherDeductions otherDeductions = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);

        Deductions welfare = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);
        Deductions deductions = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);

        Assets assets = new Assets(profits, welfare, gains, equate, timeUnit);

        Balance balance = new Balance(576000, rewards);

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
                monthsOfTheYear.getPayDay(), "Friday", "December", 16);
        System.out.println("\t");
        System.out.println("------------------------------Employee Balance Before Deductions---------------------------");
        employeeInfo.getBenefits().Salary();
        employeeInfo.getMonthsOfTheYear().printCurrentMonth(monthsOfTheYear.getMonths(), "December");
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------");
        employeeInfo.getMonthsOfTheYear().salaryWithBonus(monthsOfTheYear.getMonths(), "December");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------Employee Deductions---------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionOne();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------------------");
        employeeInfo.getAssets().aggregateOne();
        System.out.println("\t");
        System.out.println("---------------------------------Mandatory Deductions--------------------------------------");
        employeeInfo.getDeductions().getSolarMonth().setCurrentMonth();
        employeeInfo.getOtherDeductions().getSubSynodicMonth().setCurrentMonth();
        employeeInfo.getDeductions().synthesisOne("December");
        employeeInfo.getOtherDeductions().synthesisTwo("December");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------Employee Insurance--------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionTwo();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        employeeInfo.getAssets().aggregateTwo();
        System.out.println("\t");
        System.out.println("---------------------------------Optional Contributions------------------------------------");
        employeeInfo.getBenefits().getPlanetaryMonth().setCurrentMonth();
        employeeInfo.getBenefits().synthesisThree("December");
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------Company Contributions------------------------------------");
        System.out.println("------Company Benefits------");
        employeeInfo.getBenefits().HouseAllowance();
        employeeInfo.getBenefits().StudyFeesAllowance();
        employeeInfo.getBenefits().PetrolAllowance();
        employeeInfo.getBenefits().OtherAllowances();
        System.out.println("\t");
        try {
            employeeInfo.getBenefits().requisition();
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e);
            System.out.println("Ineffective operation. Beware of the bullies, Goodbye!!!.");
        }
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("--------------Requisitions--------------");
        employeeInfo.getBenefits().finalRequisition();
        System.out.println("\t");
        employeeInfo.getBalance().setSalaryRange();
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------");
        if(employeeInfo.getBalance().getAvailableBalance() == rewards.getSalary() + rewards.getBonus()) {
            employeeInfo.getBalance().printDeductedSalaryAmount(balance.getDoubleArrayList());
        } else {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Nix.");
        }
        System.out.println("===========================================================================================");
    }
}
