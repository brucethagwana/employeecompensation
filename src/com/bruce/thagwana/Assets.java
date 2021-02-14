package com.bruce.thagwana;

public class Assets {

    private final Benefits profits;
    private final Deductions welfare;
    private final OtherDeductions gains;

    public Assets(Benefits profits, Deductions welfare, OtherDeductions gains, MonthsOfTheYear period) {
        this.profits = profits;
        this.welfare = welfare;
        this.gains = gains;

    }

    public double interestRate(double amount, double INT_RATE) {
        return (amount * (INT_RATE * 9));
    }

    public void accessionOne() {
        for(int i = 1; i == 1; i++) {
            System.out.println("UIF: " + interestRate(welfare.getUIF(), i));
            System.out.println("SARS: " + interestRate(welfare.getTAX(), i));
            System.out.println("Provident Fund: " + interestRate(gains.getProvidentFund(), i));
            System.out.println("Other Diminutions: " + interestRate(gains.getOtherDiminutions(), i));
            System.out.println("Other Taxation processing.");
        }
    }

    public void accessionTwo() {
        for(int i = 1; i == 1; i++) {
            System.out.println("Medical Insurance available balance: " + interestRate(profits.getMedicalInsurance(), i));
            System.out.println("Funeral Allowance available balance: " + interestRate(profits.getFuneralAllowance(), i));
        }
    }

    public void aggregateOne() {
        for(int i = 1; i == 1; i++ ) {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Total Capital Gains: " + interestRate(welfare.getUIF() +
                    welfare.getTAX() + gains.getProvidentFund() + gains.getOtherDiminutions(), i));
        }
    }

    public void aggregateTwo() {
        for(int i = 1; i == 1; i++ ) {
            System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Total Insurance Proceeds: " + interestRate(profits.getMedicalInsurance()
                    + profits.getFuneralAllowance(), i));
        }
    }
}
