package com.bruce.thagwana;

import java.util.ArrayList;

public class Assets {

    private final Benefits profits;
    private final Deductions welfare;
    private final OtherDeductions gains;
    private final Balance equate;
    private final ArrayList<Double> timeUnit;

    public Assets(Benefits profits, Deductions welfare, OtherDeductions gains, Balance equate) {
        this.profits = profits;
        this.welfare = welfare;
        this.gains = gains;
        this.equate = equate;
        this.timeUnit = new ArrayList<>();
    }

    public void setAttainedInterest() {
        this.timeUnit.add(0.0);
        this.timeUnit.add(1.0);
        this.timeUnit.add(2.0);
        this.timeUnit.add(3.0);
        this.timeUnit.add(4.0);
        this.timeUnit.add(5.0);
        this.timeUnit.add(6.0);
        this.timeUnit.add(7.0);
        this.timeUnit.add(8.0);
        this.timeUnit.add(9.0);
        this.timeUnit.add(10.0);
        this.timeUnit.add(11.0);
//        this.timeUnit.add(12.0);
        this.timeUnit.add(13.0);
    }

    public double interestRate(double amount, double intRate) {
        if(equate.getAvailableBalance() == profits.getSalary()) {
            return amount * intRate;
        } else if(equate.getAvailableBalance() == profits.getSalary() + profits.getBonus()) {
            return amount * intRate / 2;
        } else {
            return 0;
        }
    }

    public double assetsOtherDiminutions() {
        return 0;
    }

    public void accessionOne(ArrayList<Double> timeUnit, double succeededMonth) {
        for(double d = timeUnit.indexOf(succeededMonth) - 1.0; d < timeUnit.indexOf(succeededMonth); d++) {
            if(equate.getAvailableBalance() == profits.getSalary()) {
                System.out.println("UIF: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), timeUnit.indexOf(succeededMonth))));
                System.out.println("SARS: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Provident Fund: " + String.format("%.2f", interestRate(gains.decemberDerivativeTwo(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Other Diminutions: " + String.format("%.2f", assetsOtherDiminutions()));
                System.out.println("Other Taxation Processing.");
            } else if(equate.getAvailableBalance() == profits.getSalary() + profits.getBonus()) {
                System.out.println("UIF: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), timeUnit.indexOf(succeededMonth))));
                System.out.println("SARS: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Provident Fund: " + String.format("%.2f", interestRate(gains.decemberDerivativeTwo(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Other Diminutions: " + String.format("%.2f", assetsOtherDiminutions()));
                System.out.println("Other Taxation Processing.");
            } else {
                System.out.println("The provision is unacceptable.");
            }
        }
    }

    public void accessionTwo(ArrayList<Double> timeUnit, double succeededMonth) {
        for(double d = timeUnit.indexOf(succeededMonth) - 1.0; d < timeUnit.indexOf(succeededMonth); d++) {
            if(equate.getAvailableBalance() == profits.getSalary()) {
                System.out.println("Medical Insurance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Funeral Allowance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
            } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
                System.out.println("Medical Insurance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
                System.out.println("Funeral Allowance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
            } else {
                System.out.println("The provision is unacceptable.");
            }
        }
    }

    public void aggregateOne(ArrayList<Double> timeUnit, double succeededMonth) {
        for(double d = timeUnit.indexOf(succeededMonth) - 1.0; d < timeUnit.indexOf(succeededMonth); d++) {
            if(equate.getAvailableBalance() == profits.getSalary()) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Capital Gains: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne() +
                        welfare.decemberDerivativeOne() + gains.decemberDerivativeTwo(), timeUnit.indexOf(succeededMonth))));
            } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Capital Gains: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne() +
                        welfare.decemberDerivativeOne() + gains.decemberDerivativeTwo(), timeUnit.indexOf(succeededMonth))));
            } else {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        "The provision is unacceptable.");
            }
        }
    }

    public void aggregateTwo(ArrayList<Double> timeUnit, double succeededMonth) {
        for(double d = timeUnit.indexOf(succeededMonth) - 1.0; d < timeUnit.indexOf(succeededMonth); d++) {
            if(equate.getAvailableBalance() == profits.getSalary()) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Insurance Proceeds: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree() +
                        profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
            } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Insurance Proceeds: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree() +
                        profits.decemberDerivativeThree(), timeUnit.indexOf(succeededMonth))));
            } else {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        "The provision is unacceptable.");
            }
        }
    }

    public ArrayList<Double> getTimeUnit() {
        return timeUnit;
    }
}