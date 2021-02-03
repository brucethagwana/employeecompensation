package com.bruce.thagwana;

import java.util.ArrayList;
import java.util.Objects;

public class MonthsOfTheYear {

    private final int dayOfTheMonth;
    private final ArrayList<String> months;

    public MonthsOfTheYear(int dayOfTheMonth, String presentMonth) {
        this.dayOfTheMonth = dayOfTheMonth;
        this.months = new ArrayList<String>();
    }

    public void currentMonth(String calendarDivision) {
        if(!Objects.equals(calendarDivision, "December")) {
            System.out.println("Bonus is paid in December unless otherwise.");
        } else if(calendarDivision.equals("December")) {
            System.out.println("Bonus will be paid into your account, thank you for your service." + "\n"
                    + "Please remember to report any form of harassment.");
        }
        this.months.add(calendarDivision);
    }

    public int getDayOfTheMonth() {
        System.out.println("Today's Date: " + dayOfTheMonth + "th.");
        return dayOfTheMonth;
    }

    public ArrayList<String> getMonths() {
        return months;
    }
}