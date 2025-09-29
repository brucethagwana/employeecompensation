package com.bruce.thagwana;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        EmployeeDetails employeeDetails = new EmployeeDetails("Bruce", "Thagwana", "######.##########@######.com", 11111111,
                "Artificial General Intelligence");

        Benefits rewards = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 15000000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600,
                500, 500, 2000, 1500, 500, 15000, null, null);
        Benefits aid = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 1500000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                2000, 2000, 1500, 500, 15000, null, null);
        Benefits acquire = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 1500000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, null, null);

        Balance equaliser = new Balance(576000, 576000, rewards);
        Balance equate = new Balance(576000, 576000, rewards);
        Balance proportion = new Balance(576000, 576000, rewards);
        Balance symmetry = new Balance(576000, 576000, rewards);

        MonthsOfTheYear planetaryMonth = new MonthsOfTheYear(false, 2025, "00:00", null);

        Benefits remuneration = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 1500000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600,
                500, 500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);
        Benefits profits = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 1500000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);
        Benefits benefits = new Benefits(576000, 0, 943998, 216, 100000, 8000000, 216, 1500000, 5500000, 0, 401999, 401999, 140000, 0, 200, 3500, 1000, 300, 1000, 1000, 600, 600, 500,
                500, 2000, 1500, 500, 15000, planetaryMonth, equaliser);

        MonthsOfTheYear subSynodicMonth = new MonthsOfTheYear(false, 2025, "00:00", remuneration);
        MonthsOfTheYear solarMonth = new MonthsOfTheYear(false, 2025, "00:00", remuneration);
        MonthsOfTheYear monthsOfTheYear = new MonthsOfTheYear(false, 2025, "00:00", remuneration);

        OtherDeductions gains = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);
        OtherDeductions otherDeductions = new OtherDeductions(216, 0, subSynodicMonth, symmetry, aid);

        Deductions welfare = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);
        Deductions deductions = new Deductions(216, 216, otherDeductions, solarMonth, proportion, acquire);

        Assets assets = new Assets(profits, welfare, gains, equate);

        Balance balance = new Balance(576000, 576000, rewards);

        EmployeeInfo employeeInfo = new EmployeeInfo(benefits, balance, deductions, otherDeductions, employeeDetails, true, false, monthsOfTheYear, assets);

        System.out.println("----------------------------------------Employee Details----------------------------------------");
        employeeInfo.getEmployeeDetails().Name();
        employeeInfo.getEmployeeDetails().Surname();
        employeeInfo.getEmployeeDetails().EmailAddress();
        employeeInfo.getEmployeeDetails().EmployeeID();
        employeeInfo.getEmployeeDetails().EmployeeDepartment();
        System.out.println("\t");
        System.out.println("-----------------------------------------Date and Time------------------------------------------");
        employeeInfo.getMonthsOfTheYear().setCurrentMonth();
        employeeInfo.getMonthsOfTheYear().setPlanetaryDay();
        employeeInfo.getMonthsOfTheYear().setPayDay();
        employeeInfo.getMonthsOfTheYear().printTimeAndDate(monthsOfTheYear.getDayOfTheWeek(), monthsOfTheYear.getMonths(),
                monthsOfTheYear.getPayDay(), "Thursday", "September", 25);
        System.out.println("\t");
        System.out.println("--------------------------------Employee Balance Before Deductions------------------------------");
        employeeInfo.getBenefits().salary();
        employeeInfo.getMonthsOfTheYear().printCurrentMonth(monthsOfTheYear.getMonths(), "September");
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------");
        employeeInfo.getMonthsOfTheYear().salaryWithBonus(monthsOfTheYear.getMonths(), "September");
        System.out.println("\t");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------Employee Deductions------------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().setAttainedInterest();
        employeeInfo.getAssets().accessionOne(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------------------");
        employeeInfo.getAssets().aggregateOne(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("-----------------------------------Mandatory Deductions-----------------------------------------");
        employeeInfo.getDeductions().getSolarMonth().setCurrentMonth();
        employeeInfo.getOtherDeductions().getSubSynodicMonth().setCurrentMonth();
        employeeInfo.getDeductions().synthesisOne("September");
        employeeInfo.getOtherDeductions().synthesisTwo("September");
        System.out.println("\t");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------Employee Insurance-----------------------------------------");
        System.out.println("Current Employee Contributions.");
        employeeInfo.getAssets().accessionTwo(assets.getTimeUnit(), 8.0);
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        employeeInfo.getAssets().aggregateTwo(assets.getTimeUnit(), 8.0);
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "---------------------------------------");
        System.out.println("\t");
        System.out.println("Current Employer Contributions.");
        if(employeeInfo.isOnDuty()) {
            employeeInfo.getAssets().contributionOne(assets.getTimeUnit(), 6.0);
        } else if(employeeInfo.isOffDuty()) {
            employeeInfo.getAssets().contributionOne(assets.getTimeUnit(), 6.0);
        } else {
            System.out.println("Pink-slipped");
        }
        System.out.println("\t");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "------------------------------------------");
        if(employeeInfo.isOnDuty()) {
            employeeInfo.getAssets().summationOne(assets.getTimeUnit(), 6.0);
        } else if(employeeInfo.isOffDuty()) {
            employeeInfo.getAssets().summationOne(assets.getTimeUnit(), 6.0);
        } else {
            System.out.println("Pink-slipped");
        }
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "------------------------------------------");
        System.out.println("\t");
        System.out.println("NB:'Creative Stultification' is defined as deliberate action taken by an employee or group of");
        System.out.println("employees to obstruct, delay, or undermine a coworker's work progress through job-unrelated");
        System.out.println("misconduct. This destructive behavior encompasses personal attacks like harassment, shaming,");
        System.out.println("humiliation, isolation, or professional exclusion, often fueled by inflated pride or jealousy.");
        System.out.println("It also includes serious violations such as stealing, hijacking, and claiming credit for a");
        System.out.println("coworker's output, as well as inappropriate monitoring or stalking during or outside of office");
        System.out.println("hours. Any confirmed instances of 'Creative Stultification' will result in a 25% deduction from");
        System.out.println("the perpetrator's wage, unless otherwise determined by management. These actions are a critical");
        System.out.println("concern for Human Resources, legal teams, and psychologists.");
        System.out.println("\t");
        System.out.println("-----------------------------------Optional Contributions---------------------------------------");
        employeeInfo.getBenefits().getPlanetaryMonth().setCurrentMonth();
        employeeInfo.getBenefits().synthesisThree("September");
        System.out.println("\t");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------Company Contributions---------------------------------------");
        System.out.println("------Company Benefits------");
        employeeInfo.getBenefits().houseAllowance();
        employeeInfo.getBenefits().studyFeesAllowance();
        employeeInfo.getBenefits().petrolAllowance();
        employeeInfo.getBenefits().paidTimeOffAllowance();
        employeeInfo.getBenefits().lifeInsuranceAllowance();
        employeeInfo.getBenefits().disabilityAllowance();
        employeeInfo.getBenefits().otherPerksAllowance();
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
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("--------------Requisitions--------------");
        employeeInfo.getBenefits().finalRequisition();
        System.out.println("\t");
        employeeInfo.getBalance().setSalaryRange(balance.getTreasure());
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "-----------------------");
        if(employeeInfo.getBalance().getAvailableBalance() == rewards.getSalary() + rewards.getBonus()) {
            employeeInfo.getBalance().printDeductedSalaryAmount();
        } else if(employeeInfo.getBalance().getAvailableBalance() == rewards.getPaidTimeOffAllowance() + rewards.getBonus()) {
            employeeInfo.getBalance().printDeductedPaidTimeOffAmount();
        }
        else {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Nix.");
        }
        System.out.println("================================================================================================");
    }
}