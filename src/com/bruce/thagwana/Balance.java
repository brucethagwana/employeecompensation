package com.bruce.thagwana;

import java.util.ArrayList;

public class Balance {

    private double availableBalance;
    private final Benefits rewards;
    private final ArrayList<Double> doubleArrayList;

    public Balance(double availableBalance, Benefits rewards) {
        this.availableBalance = availableBalance;
        this.rewards = rewards;
        this.doubleArrayList = new ArrayList<>();
    }

    public void setSalaryRange() {
        this.doubleArrayList.add(0, 12000.00);
        this.doubleArrayList.add(1, 24000.00);
        this.doubleArrayList.add(2, 36000.00);
        this.doubleArrayList.add(3, 48000.00);
        this.doubleArrayList.add(4, 60000.00);
        this.doubleArrayList.add(5, 72000.00);
        this.doubleArrayList.add(6, 84000.00);
        this.doubleArrayList.add(7, 96000.00);
        this.doubleArrayList.add(8, 108000.00);
        this.doubleArrayList.add(9, 120000.00);
        this.doubleArrayList.add(10, 132000.00);
        this.doubleArrayList.add(11, 144000.00);
        this.doubleArrayList.add(12, 156000.00);
        this.doubleArrayList.add(13, 168000.00);
        this.doubleArrayList.add(14, 180000.00);
        this.doubleArrayList.add(15, 192000.00);
        this.doubleArrayList.add(16, 204000.00);
        this.doubleArrayList.add(17, 216000.00);
        this.doubleArrayList.add(18, 228000.00);
        this.doubleArrayList.add(19, 240000.00);
        this.doubleArrayList.add(20, 252000.00);
        this.doubleArrayList.add(21, 264000.00);
        this.doubleArrayList.add(22, 276000.00);
        this.doubleArrayList.add(23, 288000.00);
        this.doubleArrayList.add(24, 300000.00);
        this.doubleArrayList.add(25, 312000.00);
        this.doubleArrayList.add(26, 324000.00);
        this.doubleArrayList.add(27, 336000.00);
        this.doubleArrayList.add(28, 348000.00);
        this.doubleArrayList.add(29, 360000.00);
        this.doubleArrayList.add(30, 372000.00);
        this.doubleArrayList.add(31, 384000.00);
        this.doubleArrayList.add(32, 396000.00);
        this.doubleArrayList.add(33, 408000.00);
        this.doubleArrayList.add(34, 420000.00);
        this.doubleArrayList.add(35, 432000.00);
        this.doubleArrayList.add(36, 444000.00);
        this.doubleArrayList.add(37, 456000.00);
        this.doubleArrayList.add(38, 468000.00);
        this.doubleArrayList.add(39, 480000.00);
        this.doubleArrayList.add(40, 492000.00);
        this.doubleArrayList.add(41, 504000.00);
        this.doubleArrayList.add(42, 516000.00);
        this.doubleArrayList.add(43, 528000.00);
        this.doubleArrayList.add(44, 540000.00);
        this.doubleArrayList.add(45, 552000.00);
        this.doubleArrayList.add(46, 564000.00);
        this.doubleArrayList.add(47, 576000.00);
        this.doubleArrayList.add(48, 588000.00);
        this.doubleArrayList.add(49, 600000.00);
        this.doubleArrayList.add(50, 612000.00);
        this.doubleArrayList.add(51, 624000.00);
        this.doubleArrayList.add(52, 636000.00);
        this.doubleArrayList.add(53, 648000.00);
        this.doubleArrayList.add(54, 660000.00);
        this.doubleArrayList.add(55, 672000.00);
        this.doubleArrayList.add(56, 684000.00);
        this.doubleArrayList.add(57, 696000.00);
        this.doubleArrayList.add(58, 708000.00);
        this.doubleArrayList.add(59, 720000.00);
        this.doubleArrayList.add(60, 732000.00);
        this.doubleArrayList.add(61, 744000.00);
        this.doubleArrayList.add(62, 756000.00);
        this.doubleArrayList.add(63, 768000.00);
        this.doubleArrayList.add(64, 780000.00);
        this.doubleArrayList.add(65, 792000.00);
        this.doubleArrayList.add(66, 804000.00);
        this.doubleArrayList.add(67, 816000.00);
        this.doubleArrayList.add(68, 828000.00);
        this.doubleArrayList.add(69, 840000.00);
        this.doubleArrayList.add(70, 852000.00);
        this.doubleArrayList.add(71, 864000.00);
        this.doubleArrayList.add(72, 876000.00);
        this.doubleArrayList.add(73, 888000.00);
        this.doubleArrayList.add(74, 900000.00);
        this.doubleArrayList.add(75, 912000.00);
        this.doubleArrayList.add(76, 924000.00);
        this.doubleArrayList.add(77, 936000.00);
        this.doubleArrayList.add(78, 948000.00);
        this.doubleArrayList.add(79, 960000.00);
        this.doubleArrayList.add(80, 972000.00);
        this.doubleArrayList.add(81, 984000.00);
        this.doubleArrayList.add(82, 996000.00);
        this.doubleArrayList.add(83, 1008000.00);
    }

    public void printDeductedSalaryAmount(ArrayList<Double> doubleArrayList) {
        if(this.availableBalance == rewards.getSalary()) {

            this.availableBalance -= this.availableBalance / 100 * 9;

        } else if(this.availableBalance == rewards.getSalary() + rewards.getBonus()) {

            do {

                this.availableBalance -= this.availableBalance / 100 * 9;

            } while (this.availableBalance == doubleArrayList.get(0) || (this.availableBalance == doubleArrayList.get(1)) ||
                    (this.availableBalance == doubleArrayList.get(2)) || (this.availableBalance == doubleArrayList.get(3)) ||
                    (this.availableBalance == doubleArrayList.get(4)) || (this.availableBalance == doubleArrayList.get(5)) ||
                    (this.availableBalance == doubleArrayList.get(6)) || (this.availableBalance == doubleArrayList.get(7)) ||
                    (this.availableBalance == doubleArrayList.get(8)) || (this.availableBalance == doubleArrayList.get(9)) ||
                    (this.availableBalance == doubleArrayList.get(10)) || (this.availableBalance == doubleArrayList.get(11)) ||
                    (this.availableBalance == doubleArrayList.get(12)) || (this.availableBalance == doubleArrayList.get(13)) ||
                    (this.availableBalance == doubleArrayList.get(14)) || (this.availableBalance == doubleArrayList.get(15)) ||
                    (this.availableBalance == doubleArrayList.get(16)) || (this.availableBalance == doubleArrayList.get(17)) ||
                    (this.availableBalance == doubleArrayList.get(18)) || (this.availableBalance == doubleArrayList.get(19)) ||
                    (this.availableBalance == doubleArrayList.get(20)) || (this.availableBalance == doubleArrayList.get(21)) ||
                    (this.availableBalance == doubleArrayList.get(22)) || (this.availableBalance == doubleArrayList.get(23)) ||
                    (this.availableBalance == doubleArrayList.get(24)) || (this.availableBalance == doubleArrayList.get(25)) ||
                    (this.availableBalance == doubleArrayList.get(26)) || (this.availableBalance == doubleArrayList.get(27)) ||
                    (this.availableBalance == doubleArrayList.get(28)) || (this.availableBalance == doubleArrayList.get(29)) ||
                    (this.availableBalance == doubleArrayList.get(30)) || (this.availableBalance == doubleArrayList.get(31)) ||
                    (this.availableBalance == doubleArrayList.get(32)) || (this.availableBalance == doubleArrayList.get(33)) ||
                    (this.availableBalance == doubleArrayList.get(34)) || (this.availableBalance == doubleArrayList.get(35)) ||
                    (this.availableBalance == doubleArrayList.get(36)) || (this.availableBalance == doubleArrayList.get(37)) ||
                    (this.availableBalance == doubleArrayList.get(38)) || (this.availableBalance == doubleArrayList.get(39)) ||
                    (this.availableBalance == doubleArrayList.get(40)) || (this.availableBalance == doubleArrayList.get(41)) ||
                    (this.availableBalance == doubleArrayList.get(42)) || (this.availableBalance == doubleArrayList.get(43)) ||
                    (this.availableBalance == doubleArrayList.get(44)) || (this.availableBalance == doubleArrayList.get(45)) ||
                    (this.availableBalance == doubleArrayList.get(46)) || (this.availableBalance == doubleArrayList.get(47)) ||
                    (this.availableBalance == doubleArrayList.get(48)) || (this.availableBalance == doubleArrayList.get(49)) ||
                    (this.availableBalance == doubleArrayList.get(50)) || (this.availableBalance == doubleArrayList.get(51)) ||
                    (this.availableBalance == doubleArrayList.get(52)) || (this.availableBalance == doubleArrayList.get(53)) ||
                    (this.availableBalance == doubleArrayList.get(54)) || (this.availableBalance == doubleArrayList.get(55)) ||
                    (this.availableBalance == doubleArrayList.get(56)) || (this.availableBalance == doubleArrayList.get(57)) ||
                    (this.availableBalance == doubleArrayList.get(58)) || (this.availableBalance == doubleArrayList.get(59)) ||
                    (this.availableBalance == doubleArrayList.get(60)) || (this.availableBalance == doubleArrayList.get(61)) ||
                    (this.availableBalance == doubleArrayList.get(62)) || (this.availableBalance == doubleArrayList.get(63)) ||
                    (this.availableBalance == doubleArrayList.get(64)) || (this.availableBalance == doubleArrayList.get(65)) ||
                    (this.availableBalance == doubleArrayList.get(66)) || (this.availableBalance == doubleArrayList.get(67)) ||
                    (this.availableBalance == doubleArrayList.get(68)) || (this.availableBalance == doubleArrayList.get(69)) ||
                    (this.availableBalance == doubleArrayList.get(70)) || (this.availableBalance == doubleArrayList.get(71)) ||
                    (this.availableBalance == doubleArrayList.get(72)) || (this.availableBalance == doubleArrayList.get(73)) ||
                    (this.availableBalance == doubleArrayList.get(74)) || (this.availableBalance == doubleArrayList.get(75)) ||
                    (this.availableBalance == doubleArrayList.get(76)) || (this.availableBalance == doubleArrayList.get(77)) ||
                    (this.availableBalance == doubleArrayList.get(78)) || (this.availableBalance == doubleArrayList.get(79)) ||
                    (this.availableBalance == doubleArrayList.get(80)) || (this.availableBalance == doubleArrayList.get(81)) ||
                    (this.availableBalance == doubleArrayList.get(82)));
        }
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Nett Pay: " +
                String.format("%.2f", this.availableBalance));
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public ArrayList<Double> getDoubleArrayList() {
        return doubleArrayList;
    }
}