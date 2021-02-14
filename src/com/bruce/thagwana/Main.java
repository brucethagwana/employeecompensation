package com.bruce.thagwana;

public class Main {

    public static void main(String[] args) {

        Balance balance = new Balance(354999);
        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(false, 24, 2021, "00:00");
        Benefits benefits = new Benefits(354999, 354999, 7500, 100000, 8000000, 4000, 1500000, 5500000, balance, monthsOfTheYear);

        OtherDeductions otherDeductions = new OtherDeductions(1600, 0);
        Deductions deductions = new Deductions(4000, 3000, otherDeductions);

        EmployeeDetails employeeDetails = new EmployeeDetails("######", "##########", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        Assets assets = new Assets(new Benefits(354999, 354999, 7500, 100000, 8000000, 4000, 1500000, 5500000, null, null),
                new Deductions(4000, 3000, null), new OtherDeductions(1600, 0), new MonthsOfTheYear(false, 24, 2021, "00:00"));

        EmployeeInfo employeeInfo = new EmployeeInfo(benefits, balance, deductions, otherDeductions, employeeDetails, monthsOfTheYear, assets);

        System.out.println("---------------------Employee Details-----------------------");
        employeeInfo.getEmployeeDetails().Name();
        employeeInfo.getEmployeeDetails().Surname();
        employeeInfo.getEmployeeDetails().EmailAddress();
        employeeInfo.getEmployeeDetails().EmployeeID();
        employeeInfo.getEmployeeDetails().EmployeeDepartment();
        System.out.println("\t");
        System.out.println("----------------------Date and Time-------------------------");
        employeeInfo.getMonthsOfTheYear().setCurrentMonth();
        employeeInfo.getMonthsOfTheYear().setPlanetaryDay();
        employeeInfo.getMonthsOfTheYear().printTimeAndDate(monthsOfTheYear.getDayOfTheWeek(), monthsOfTheYear.getMonths(), "Friday");
        System.out.println("\t");
        System.out.println("-------------Employee Balance Before Deductions-------------");
        employeeInfo.getBenefits().Salary();
        employeeInfo.getMonthsOfTheYear().printCurrentMonth(monthsOfTheYear.getMonths(), "September");
        System.out.println("\t");
        System.out.println("-------------------Company Contributions--------------------");
        employeeInfo.getBenefits().HouseAllowance();
        employeeInfo.getBenefits().StudyFeesAllowance();
        employeeInfo.getBenefits().PetrolAllowance();
        employeeInfo.getBenefits().OtherAllowances();
        System.out.println("\t");
        System.out.println("------------------------------------------------------------");
        System.out.println("--------------------Employee Deductions---------------------");
        System.out.println("Current Employee Contributions.");
//        employeeInfo.getDeductions().UIFDeduction();
//        employeeInfo.getDeductions().TAXDeduction();
//        employeeInfo.getOtherDeductions().Provident();
//        employeeInfo.getOtherDeductions().Diminutions();
//        employeeInfo.getDeductions().OtherTaxation();
        employeeInfo.getAssets().accessionOne();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "--------------------------------");
        employeeInfo.getAssets().aggregateOne();
        System.out.println("\t");
        System.out.println("-------------------Mandatory Deductions---------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getDeductions().setUIF(4000);
        employeeInfo.getDeductions().setTAX(3000);
        employeeInfo.getOtherDeductions().setProvidentFund(1600);
        employeeInfo.getOtherDeductions().setOtherDiminutions(0);
        employeeInfo.getDeductions().setOtherDeductions(otherDeductions);
        System.out.println("\t");
        System.out.println("------------------------------------------------------------");
        System.out.println("--------------------Employee Insurance----------------------");
        System.out.println("Current Employee Contributions.");
//        employeeInfo.getBenefits().MedicalInsurance();
//        employeeInfo.getBenefits().FuneralAllowance();
        employeeInfo.getAssets().accessionTwo();
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "------------------------------------");
        employeeInfo.getAssets().aggregateTwo();
        System.out.println("\t");
        System.out.println("------------------Optional Contributions--------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getBenefits().setMedicalInsurance(7500);
        employeeInfo.getBenefits().setFuneralAllowance(4000);
        System.out.println("\t");
        System.out.println("-------------------------Nett Pay---------------------------");
        employeeInfo.getBalance().deduct();
        System.out.println("============================================================");

    }
}
