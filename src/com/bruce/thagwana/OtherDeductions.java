package com.bruce.thagwana;

public class OtherDeductions {

    private double providentFund;
    private double otherDiminutions;

    public OtherDeductions(double providentFund, double otherDiminutions) {
        this.providentFund = providentFund;
        this.otherDiminutions = otherDiminutions;
    }

    public void Provident() {
        System.out.println("Provident Fund: " + providentFund);
    }

    public void Diminutions() {
        System.out.println("Other diminutions: " + otherDiminutions);
    }

    public double getProvidentFund() {
        return providentFund;
    }

    public void setProvidentFund(double providentFund) {
        System.out.println("Provident Fund deducted: " + providentFund);
        this.providentFund = providentFund;
    }

    public double getOtherDiminutions() {
        return otherDiminutions;
    }

    public void setOtherDiminutions(double otherDiminutions) {
        System.out.println("Other reductions: " + otherDiminutions);
        this.otherDiminutions = otherDiminutions;
    }
}
