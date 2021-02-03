package com.bruce.thagwana;

public class Main {

    public static void main(String[] args) {
        Balance balance = new Balance(354999);
        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(25, "September");
        Benefits benefits = new Benefits(354999, 354999, 100000, 10000, 8000000, 75000, 1500000, 5500000, balance, monthsOfTheYear);

        OtherDeductions otherDeductions = new OtherDeductions(1600, 0);
        Deductions deductions = new Deductions(4000, 3000, otherDeductions);

        EmployeeDetails employeeDetails = new EmployeeDetails("######", "##########", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        EmployeeInfo employeeInfo = new EmployeeInfo(benefits, balance, deductions, otherDeductions, employeeDetails, monthsOfTheYear);

        System.out.println("---------------------Employee Details-----------------------");
        employeeInfo.getEmployeeDetails().Name();
        employeeInfo.getEmployeeDetails().Surname();
        employeeInfo.getEmployeeDetails().EmailAddress();
        employeeInfo.getEmployeeDetails().EmployeeID();
        employeeInfo.getEmployeeDetails().EmployeeDepartment();
        System.out.println("\t");
        System.out.println("-------------Employee Balance Before Deductions-------------");
        employeeInfo.getBenefits().Salary();
        employeeInfo.getMonthsOfTheYear().currentMonth("September");
        employeeInfo.getBenefits().Bonus();
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
        employeeInfo.getDeductions().UIFDeduction();
        employeeInfo.getDeductions().TAXDeduction();
        employeeInfo.getOtherDeductions().Provident();
        employeeInfo.getOtherDeductions().Diminutions();
        employeeInfo.getDeductions().OtherTaxation();
        System.out.println("-------------------Mandatory Deductions---------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getDeductions().setUIF(2000);
        employeeInfo.getDeductions().setTAX(1500);
        employeeInfo.getOtherDeductions().setProvidentFund(800);
        employeeInfo.getOtherDeductions().setOtherDiminutions(0);
        employeeInfo.getDeductions().setOtherDeductions(otherDeductions);
        System.out.println("\t");
        System.out.println("------------------------------------------------------------");
        System.out.println("--------------------Employee Insurance----------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getBenefits().MedicalInsurance();
        employeeInfo.getBenefits().FuneralAllowance();
        System.out.println("------------------Optional Contributions--------------------");
        System.out.println("Monies deducted on a monthly basis.");
        employeeInfo.getBenefits().setMedicalInsurance(900);
        employeeInfo.getBenefits().setFuneralAllowance(500);
        System.out.println("\t");
        System.out.println("-------------------------Nett Pay---------------------------");
        employeeInfo.getBalance().deduct();
        System.out.println("============================================================");

    }
}
