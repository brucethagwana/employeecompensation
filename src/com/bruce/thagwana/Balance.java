package com.bruce.thagwana;

import java.util.ArrayList;

public class Balance {

    private double availableBalance;
    private final Benefits rewards;
    private final Deductions implications;
    private final OtherDeductions entailments;
    private final MonthsOfTheYear monthDivision;
    private final ArrayList<Double> doubleArrayList;

    public Balance(double availableBalance, Benefits rewards, Deductions implications, OtherDeductions entailments, MonthsOfTheYear monthDivision) {
        this.availableBalance = availableBalance;
        this.rewards = rewards;
        this.implications = implications;
        this.entailments = entailments;
        this.monthDivision = monthDivision;
        this.doubleArrayList = new ArrayList<>();
    }

    public void setSalaryRange() {
        doubleArrayList.add(0, 12000.00);
        doubleArrayList.add(1, 24000.00);
        doubleArrayList.add(2, 36000.00);
        doubleArrayList.add(3, 48000.00);
        doubleArrayList.add(4, 60000.00);
        doubleArrayList.add(5, 72000.00);
        doubleArrayList.add(6, 84000.00);
        doubleArrayList.add(7, 96000.00);
        doubleArrayList.add(8, 108000.00);
        doubleArrayList.add(9, 120000.00);
        doubleArrayList.add(10, 132000.00);
        doubleArrayList.add(11, 144000.00);
        doubleArrayList.add(12, 156000.00);
        doubleArrayList.add(13, 168000.00);
        doubleArrayList.add(14, 180000.00);
        doubleArrayList.add(15, 192000.00);
        doubleArrayList.add(16, 204000.00);
        doubleArrayList.add(17, 216000.00);
        doubleArrayList.add(18, 228000.00);
        doubleArrayList.add(19, 240000.00);
        doubleArrayList.add(20, 252000.00);
        doubleArrayList.add(21, 264000.00);
        doubleArrayList.add(22, 288000.00);
        doubleArrayList.add(23, 312000.00);
        doubleArrayList.add(24, 324000.00);
        doubleArrayList.add(25, 336000.00);
        doubleArrayList.add(26, 348000.00);
        doubleArrayList.add(27, 360000.00);
        doubleArrayList.add(28, 372000.00);
        doubleArrayList.add(29, 384000.00);
        doubleArrayList.add(30, 396000.00);
        doubleArrayList.add(31, 408000.00);

        //Bonus range
        doubleArrayList.add(32, 720000.00);
    }

    public double salaryReductionPercentage() {
        this.availableBalance = this.availableBalance / 100 * 9.12;
        return availableBalance;
    }

    public double bonusReductionPercentage() {
        this.availableBalance = this.availableBalance / 100 * 6.84;
        return availableBalance;
    }

    public void printDeductedSalaryAmount(ArrayList<Double> doubleArrayList) {
        if(this.availableBalance == doubleArrayList.get(27)) {
//            this.availableBalance -= implications.getUIF() + implications.getTAX() + entailments.getProvidentFund()
//                    + entailments.getOtherDiminutions() + rewards.getMedicalInsurance() + rewards.getFuneralAllowance();

            this.availableBalance -= salaryReductionPercentage();
        } else {
            this.availableBalance = rewards.getSalary() + rewards.getBonus();
            do {
//                this.availableBalance -= (implications.getUIF() + implications.getTAX() + entailments.getProvidentFund()
//                        + entailments.getOtherDiminutions() + rewards.getMedicalInsurance() + rewards.getFuneralAllowance()) *  1.50;

                this.availableBalance -= bonusReductionPercentage();
            } while (this.availableBalance == doubleArrayList.get(32));
        }
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Nett Pay: " + this.availableBalance);
    }


    public double getAvailableBalance() {
        return availableBalance;
    }

    public ArrayList<Double> getDoubleArrayList() {
        return doubleArrayList;
    }
}






