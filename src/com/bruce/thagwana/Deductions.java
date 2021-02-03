package com.bruce.thagwana;

public class Deductions {

    private double UIF;
    private double TAX;
    private OtherDeductions otherDeductions;

    public Deductions(double UIF, double TAX, OtherDeductions otherDeductions) {
        this.UIF = UIF;
        this.TAX = TAX;
        this.otherDeductions = otherDeductions;
    }

    public void UIFDeduction() {
        System.out.println("UIF: " + UIF);

    }

    public void TAXDeduction() {
        System.out.println("SARS: " + TAX);
    }

    public void OtherTaxation() {
        System.out.println("Other Taxation processing. ");
    }

    public double getUIF() {
        return UIF;
    }

    public void setUIF(double UIF) {
        System.out.println("UIF deducted: " + UIF);
        this.UIF = UIF;
    }

    public double getTAX() {
        return TAX;
    }

    public void setTAX(double TAX) {
        System.out.println("TAX deducted: " + TAX);
        this.TAX = TAX;
    }

    public OtherDeductions getOtherDeductions() {
        return otherDeductions;
    }

    public void setOtherDeductions(OtherDeductions otherDeductions) {
        System.out.println("Further deductions processing.");
        this.otherDeductions = otherDeductions;
    }
}
