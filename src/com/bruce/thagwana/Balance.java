package com.bruce.thagwana;

public class Balance {

    private double treasure;
    private double availableBalance;
    private final Benefits rewards;

    public Balance(double treasure, double availableBalance, Benefits rewards) {
        this.treasure = treasure;
        this.availableBalance = availableBalance;
        this.rewards = rewards;
    }

    public void setSalaryRange(double treasure) {
        this.treasure = treasure;
    }

    public void printDeductedSalaryAmount() {
        if(this.availableBalance == rewards.getSalary()) {
            this.availableBalance -= this.availableBalance / 100 * 9;
        } else if(this.availableBalance == rewards.getSalary() + rewards.getBonus()) {
            this.availableBalance -= this.availableBalance / 100 * 18;
        }
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Nett Pay: " +
                String.format("%.2f", this.availableBalance));
    }

    public double getTreasure() {
        return treasure;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}