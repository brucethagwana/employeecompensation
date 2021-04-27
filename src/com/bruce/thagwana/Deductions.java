package com.bruce.thagwana;

public class Deductions {

    private final double UIF;
    private final double TAX;
    private final OtherDeductions otherDeductions;
    private final MonthsOfTheYear solarMonth;
    private final Balance proportion;
    private final Benefits acquire;

    public Deductions(double UIF, double TAX, OtherDeductions otherDeductions, MonthsOfTheYear solarMonth, Balance proportion, Benefits acquire) {
        this.UIF = UIF;
        this.TAX = TAX;
        this.otherDeductions = otherDeductions;
        this.solarMonth = solarMonth;
        this.proportion = proportion;
        this.acquire = acquire;
    }

    public double decemberDerivativeOne() {
        if(proportion.getAvailableBalance() == acquire.getSalary()) {
            return proportion.getAvailableBalance() / 100 * 1.8;
        } else if(proportion.getAvailableBalance() == acquire.getSalary() + acquire.getBonus()){
            return proportion.getAvailableBalance() / 100 * 1.8;
        } else {
            return 0;
        }
    }

    public void synthesisOne(String newMonthPhase) {
        int currentMonth = solarMonth.getMonths().indexOf(newMonthPhase);
        if(currentMonth >= 0) {
            System.out.println("Monies deducted in " + solarMonth.getMonths().get(currentMonth) + ".");
            System.out.println("UIF deducted: " + String.format("%.2f", decemberDerivativeOne()));
            System.out.println("TAX deducted: " + String.format("%.2f", decemberDerivativeOne()));
            System.out.println("Further deductions processing.");
        } else {
            System.out.println("The accession is avoidable.");
        }
    }

    public double getUIF() {
        return UIF;
    }

    public double getTAX() {
        return TAX;
    }

    public MonthsOfTheYear getSolarMonth() {
        return solarMonth;
    }
}
