package com.bruce.thagwana;

public class Assets {

    private final Benefits profits;
    private final Deductions welfare;
    private final OtherDeductions gains;
    private final Balance equate;
    private final MonthsOfTheYear timeUnit;

    public Assets(Benefits profits, Deductions welfare, OtherDeductions gains, Balance equate, MonthsOfTheYear timeUnit) {
        this.profits = profits;
        this.welfare = welfare;
        this.gains = gains;
        this.equate = equate;
        this.timeUnit = timeUnit;
    }

    //
    public double interestRate(double amount, int intRate) {
        return amount * intRate * 6.5;
    }

    public double assetsInterestOtherDiminutions() {
        return 0;
    }

    public void accessionOne() {
        if(equate.getAvailableBalance() == profits.getSalary()) {
            for(int i = 1; i == 1; i++) {
                System.out.println("UIF: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), i)));
                System.out.println("SARS: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), i)));
                System.out.println("Provident Fund: " + String.format("%.2f", interestRate(gains.decemberDerivativeTwo(), i)));
                System.out.println("Other Diminutions: " + String.format("%.2f", assetsInterestOtherDiminutions()));
                System.out.println("Other Taxation Processing.");
            }
        } else if(equate.getAvailableBalance() == profits.getSalary() + profits.getBonus()) {
            for(int i = 1; i == 1; i++) {
                System.out.println("UIF: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), i)));
                System.out.println("SARS: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne(), i)));
                System.out.println("Provident Fund: " + String.format("%.2f", interestRate(gains.decemberDerivativeTwo(), i)));
                System.out.println("Other Diminutions: " + String.format("%.2f", assetsInterestOtherDiminutions()));
                System.out.println("Other Taxation Processing.");
            }
        } else {
            System.out.println("The provision is unacceptable.");
        }
    }

    public void accessionTwo() {
        if(equate.getAvailableBalance() == profits.getSalary()) {
            for(int i = 1; i == 1; i++) {
                System.out.println("Medical Insurance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), i)));
                System.out.println("Funeral Allowance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), i)));
            }
        } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
            for(int i = 1; i == 1; i++) {
                System.out.println("Medical Insurance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), i)));
                System.out.println("Funeral Allowance: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree(), i)));
            }
        } else {
            System.out.println("The provision is unacceptable.");
        }
    }

    public void aggregateOne() {
        if(equate.getAvailableBalance() == profits.getSalary()) {
            for(int i = 1; i == 1; i++ ) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Capital Gains: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne() +
                        welfare.decemberDerivativeOne() + gains.decemberDerivativeTwo(), i)));
            }
        } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
            for(int i = 1; i == 1; i++ ) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Capital Gains: " + String.format("%.2f", interestRate(welfare.decemberDerivativeOne() +
                        welfare.decemberDerivativeOne() + gains.decemberDerivativeTwo(), i)));
            }
        } else {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                    "The provision is unacceptable.");
        }
    }

    public void aggregateTwo() {
        if(equate.getAvailableBalance() == profits.getSalary()) {
            for(int i = 1; i == 1; i++ ) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Insurance Proceeds: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree() +
                        profits.decemberDerivativeThree(), i)));
            }
        } else if(profits.getSalary() + profits.getBonus() == equate.getAvailableBalance()) {
            for(int i = 1; i == 1; i++ ) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                        " Total Insurance Proceeds: " + String.format("%.2f", interestRate(profits.decemberDerivativeThree() +
                        profits.decemberDerivativeThree(), i)));
            }
        } else {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" +
                    "The provision is unacceptable.");
        }
    }
}