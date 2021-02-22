package com.bruce.thagwana;

import java.util.ArrayList;
import java.util.Objects;

public class MonthsOfTheYear {

    private final boolean federalHoliday;
    private final int dateOfTheWeek;
    private final int calendarYear;
    private final String time;
    private final Benefits remuneration;
    private final ArrayList<String> months;
    private final ArrayList<String> dayOfTheWeek;

    public MonthsOfTheYear(boolean federalHoliday, int dateOfTheWeek, int calendarYear, String time, Benefits remuneration) {
        this.federalHoliday = federalHoliday;
        this.dateOfTheWeek = dateOfTheWeek;
        this.calendarYear = calendarYear;
        this.time = time;
        this.remuneration = remuneration;
        this.months = new ArrayList<>();
        this.dayOfTheWeek = new ArrayList<>();
    }

    public void setCurrentMonth() {
        this.months.add(0, "January");
        this.months.add(1, "February");
        this.months.add(2, "March");
        this.months.add(3, "April");
        this.months.add(4, "May");
        this.months.add(5, "June");
        this.months.add(6, "July");
        this.months.add(7, "August");
        this.months.add(8, "September");
        this.months.add(9, "October");
        this.months.add(10, "November");
        this.months.add(11, "December");
    }

    public double incentive (double earnings, double dividend) {
        return earnings + dividend;
    }

    public void salaryWithBonus(ArrayList<String> months, String calendarMonth) {
        for(int i = 0; i == 0; i++) {
            if(calendarMonth.equals(months.get(11))) {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Total Share: " + incentive(remuneration.getSalary()
                        + remuneration.getBonus(), i));
            } else {
                System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Total Share: " + incentive(remuneration.getSalary()
                        + 0, i));
            }
        }
    }

    public void printCurrentMonth(ArrayList<String> months, String calendarDivision) {
        if(!Objects.equals(calendarDivision, "December")) {
            System.out.println("Bonus is paid in " + months.get(11) + " unless otherwise.");
        }
        if(calendarDivision.equals(months.get(11))) {
            System.out.println("Bonus available balance: " + remuneration.getBonus());
            System.out.println("\t");
            System.out.println("Bonus will be paid into your account, thank you for your service." + "\n"
                    + "Please remember to report any form of harassment.");
        }
    }

    public void setPlanetaryDay() {
        this.dayOfTheWeek.add(0, "Monday");
        this.dayOfTheWeek.add(1, "Tuesday");
        this.dayOfTheWeek.add(2, "Wednesday");
        this.dayOfTheWeek.add(3, "Thursday");
        this.dayOfTheWeek.add(4, "Friday");
        this.dayOfTheWeek.add(5, "Saturday");
        this.dayOfTheWeek.add(6, "Sunday");
    }

    public void printTimeAndDate(ArrayList<String> dayOfTheWeek, ArrayList<String> months, String presentDay) {
        if(this.dateOfTheWeek == 24) {
            System.out.println(dayOfTheWeek.get(4) + ", " + months.get(8) + ", " + getDateOfTheWeek() + ", "
                    + getCalendarYear() + ", " + getTime());
        } else {
            System.out.println("End of the financial year, better luck next year.");
        }
        if ((presentDay.equals(dayOfTheWeek.get(0))) || (presentDay.equals(dayOfTheWeek.get(1))) || (presentDay.equals(dayOfTheWeek.get(2)))
                || (presentDay.equals(dayOfTheWeek.get(3)) || (presentDay.equals(dayOfTheWeek.get(4))))) {
            System.out.println("Your account has been credited.");
        } else if((presentDay.equals(dayOfTheWeek.get(5))) || (presentDay.equals(dayOfTheWeek.get(6)))) {
            System.out.println("Salary paid earlier than expected.");
        } else{
            System.out.println("The holiday will never frighten you.");
        }
        if (isFederalHoliday()){
            System.out.println("It's a good thing that you just got served earlier than you expected. Enjoy!!!");
        }
    }

    public boolean isFederalHoliday() {
        return federalHoliday;
    }

    public int getDateOfTheWeek() {
        return dateOfTheWeek;
    }

    public int getCalendarYear() {
        return calendarYear;
    }

    public String getTime() {
        return time;
    }

    public ArrayList<String> getMonths() {
        return months;
    }

    public ArrayList<String> getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}