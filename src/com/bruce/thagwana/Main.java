package com.bruce.thagwana;

public class Main {

    public static void main(String[] args) {

        Balance balance = new Balance((360000), new Benefits(360000, 360000, 7491, 100000, 8000000, 5635, 1500000, 5500000, null, null),
                new Deductions(7668, 6668, null), new OtherDeductions(5370, 0), new MonthsOfTheYear(false, 24, 2021, "00:00", null));

        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(false, 24, 2021, "00:00", new Benefits(360000, 360000, 7491, 100000, 8000000,
                5635, 1500000, 5500000, null, null));

        Benefits benefits = new Benefits(360000, 360000, 7491, 100000, 8000000, 5635, 1500000, 5500000, balance, monthsOfTheYear);

        OtherDeductions otherDeductions = new OtherDeductions(5370, 0);
        Deductions deductions = new Deductions(7668, 6668, otherDeductions);

        EmployeeDetails employeeDetails = new EmployeeDetails("######", "##########", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        Assets assets = new Assets(new Benefits(360000, 360000, 7491, 100000, 8000000, 5635, 1500000, 5500000, null, null),
                new Deductions(7668, 6668, null), new OtherDeductions(5370, 0), new MonthsOfTheYear(false, 24, 2021, "00:00", new Benefits(360000,
                360000, 7491, 100000, 8000000, 5635, 1500000, 5500000, null, null)));

        EmployeeInfo employeeInfo = new EmployeeInfo(benefits, balance, deductions, otherDeductions, employeeDetails, monthsOfTheYear, assets);

        System.out.println("-------------------------Employee Details--------------------------");
        employeeInfo.getEmployeeDetails().Name();
        employeeInfo.getEmployeeDetails().Surname();
        employeeInfo.getEmployeeDetails().EmailAddress();
        employeeInfo.getEmployeeDetails().EmployeeID();
        employeeInfo.getEmployeeDetails().EmployeeDepartment();
        System.out.println("\t");
        System.out.println("--------------------------Date and Time----------------------------");
        employeeInfo.getMonthsOfTheYear().setCurrentMonth();
        employeeInfo.getMonthsOfTheYear().setPlanetaryDay();
        employeeInfo.getMonthsOfTheYear().printTimeAndDate(monthsOfTheYear.getDayOfTheWeek(), monthsOfTheYear.getMonths(), "Friday");
        System.out.println("\t");
        System.out.println("-----------------Employee Balance Before Deductions----------------");
        employeeInfo.getBenefits().Salary();
        employeeInfo.getMonthsOfTheYear().printCurrentMonth(monthsOfTheYear.getMonths(), "September");
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        employeeInfo.getMonthsOfTheYear().salaryWithBonus(monthsOfTheYear.getMonths(), "September");
        System.out.println("\t");
        System.out.println("------------------------Company Contributions----------------------");
        employeeInfo.getBenefits().HouseAllowance();
        employeeInfo.getBenefits().StudyFeesAllowance();
        employeeInfo.getBenefits().PetrolAllowance();
        employeeInfo.getBenefits().OtherAllowances();
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------Employee Deductions-----------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionOne();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        employeeInfo.getAssets().aggregateOne();
        System.out.println("\t");
        System.out.println("-------------------------Mandatory Deductions----------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getDeductions().setUIF(7668);
        employeeInfo.getDeductions().setTAX(6668);
        employeeInfo.getOtherDeductions().setProvidentFund(5370);
        employeeInfo.getOtherDeductions().setOtherDiminutions(0);
        employeeInfo.getDeductions().setOtherDeductions(otherDeductions);
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("------------------------Employee Insurance-------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionTwo();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-------------------------------------------");
        employeeInfo.getAssets().aggregateTwo();
        System.out.println("\t");
        System.out.println("----------------------Optional Contributions-----------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getBenefits().setMedicalInsurance(7491);
        employeeInfo.getBenefits().setFuneralAllowance(5635);
        System.out.println("\t");
        System.out.println("-------------------------------------------------------------------");
        employeeInfo.getBalance().setSalaryRange();
        employeeInfo.getBalance().printDeductedSalaryAmount(balance.getDoubleArrayList());
        System.out.println("===================================================================");

    }
}
