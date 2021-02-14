package com.bruce.thagwana;

public class Balance {

    private double availableBalance;

    public Balance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double deduct() {
        if(this.availableBalance <= 549999) {
            this.availableBalance -= 29105;
        } else {
            this.availableBalance -= 58211;
        }
        System.out.println("Available Nett Pay after deductions: " + this.availableBalance);

        return this.availableBalance;
    }
}
