package com.bruce.thagwana;

public class OtherDeductions {

    private final double providentFund;
    private final double otherDiminutions;
    private final MonthsOfTheYear subSynodicMonth;
    private final Balance symmetry;
    private final Benefits aid;

    public OtherDeductions(double providentFund, double otherDiminutions, MonthsOfTheYear subSynodicMonth, Balance symmetry, Benefits aid) {
        this.providentFund = providentFund;
        this.otherDiminutions = otherDiminutions;
        this.subSynodicMonth = subSynodicMonth;
        this.symmetry = symmetry;
        this.aid = aid;
    }

    public double decemberDerivativeTwo() {
        if(symmetry.getAvailableBalance() == aid.getSalary()) {
            return symmetry.getAvailableBalance() / 100 * 1.8;
        } else if(symmetry.getAvailableBalance() == aid.getSalary() + aid.getBonus()) {
            return symmetry.getAvailableBalance() / 100 * 1.8;
        } else {
            return 0;
        }
    }

    public double decemberOtherDiminutions() {
        return 0;
    }

    public void synthesisTwo(String newMonthPhase) {
        if(newMonthPhase.equals(subSynodicMonth.getMonths().get(0)) || (newMonthPhase.equals(subSynodicMonth.getMonths().get(1))) ||
                (newMonthPhase.equals(subSynodicMonth.getMonths().get(2))) || (newMonthPhase.equals(subSynodicMonth.getMonths().get(3))) ||
                (newMonthPhase.equals(subSynodicMonth.getMonths().get(4))) || (newMonthPhase.equals(subSynodicMonth.getMonths().get(5))) ||
                (newMonthPhase.equals(subSynodicMonth.getMonths().get(6))) || (newMonthPhase.equals(subSynodicMonth.getMonths().get(7))) ||
                (newMonthPhase.equals(subSynodicMonth.getMonths().get(8))) || (newMonthPhase.equals(subSynodicMonth.getMonths().get(9))) ||
                (newMonthPhase.equals(subSynodicMonth.getMonths().get(10)))) {
            System.out.println("Provident Fund deducted: " + String.format("%.2f", decemberDerivativeTwo()));
            System.out.println("Other reductions: " + String.format("%.2f", decemberOtherDiminutions()));
        }else if(newMonthPhase.equals(subSynodicMonth.getMonths().get(11))) {
                System.out.println("Provident Fund deducted: " + String.format("%.2f", decemberDerivativeTwo()));
                System.out.println("Other reductions: " + String.format("%.2f", decemberOtherDiminutions()));
        } else {
            System.out.println("The accession is avoidable.");
        }
    }

    public double getProvidentFund() {
        return providentFund;
    }

    public double getOtherDiminutions() {
        return otherDiminutions;
    }

    public MonthsOfTheYear getSubSynodicMonth() {
        return subSynodicMonth;
    }
}
