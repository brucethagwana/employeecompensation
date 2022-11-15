package com.bruce.thagwana;

import java.util.Scanner;

public class Benefits {

    private final double salary;
    private final double bonus;
    private final double medicalInsurance;
    private double petrolAllowance;
    private double houseAllowance;
    private final double funeralAllowance;
    private double studyFeesAllowance;
    private final MonthsOfTheYear planetaryMonth;
    private final Balance equaliser;
    double house, study, petrol;
    private final double lunchRequisition;
    private final double salonRequisition;
    private final double uberRequisition;
    private final double uberEatsRequisition;
    private final double iTunesRequisition;
    private final double appleStoreRequisition;
    private final double sterKinekorRequisition;
    private final double netflixRequisition;
    private final double playStoreRequisition;
    private final double playMusicRequisition;
    private final double showmaxRequisition;
    private final double PrimeVideoRequisition;
    private final double microsoftStoreRequisition;
    private final double OtherSoftwareRequisitions;
    int commodity;
    String otherCommodity, answer;
    boolean processing = false;

    public Benefits(double salary, double bonus, double medicalInsurance, double petrolAllowance, double houseAllowance,
                    double funeralAllowance, double studyFeesAllowance, double otherAllowances, double lunchRequisition,
                    double salonRequisition, double uberRequisition, double uberEatsRequisition, double iTunesRequisition,
                    double appleStoreRequisition, double sterKinekorRequisition, double netflixRequisition, double playStoreRequisition,
                    double playMusicRequisition, double showmaxRequisition, double PrimeVideoRequisition, double microsoftStoreRequisition, double OtherSoftwareRequisitions, MonthsOfTheYear planetaryMonth,
                    Balance equaliser) {
        this.salary = salary;
        this.bonus = bonus;
        this.medicalInsurance = medicalInsurance;
        this.petrolAllowance = petrolAllowance;
        this.houseAllowance = houseAllowance;
        this.funeralAllowance = funeralAllowance;
        this.studyFeesAllowance = studyFeesAllowance;
        this.planetaryMonth = planetaryMonth;
        this.equaliser = equaliser;
        this.lunchRequisition = lunchRequisition;
        this.salonRequisition = salonRequisition;
        this.uberRequisition = uberRequisition;
        this.uberEatsRequisition = uberEatsRequisition;
        this.iTunesRequisition = iTunesRequisition;
        this.appleStoreRequisition = appleStoreRequisition;
        this.sterKinekorRequisition = sterKinekorRequisition;
        this.netflixRequisition = netflixRequisition;
        this.playStoreRequisition = playStoreRequisition;
        this.playMusicRequisition = playMusicRequisition;
        this.showmaxRequisition = showmaxRequisition;
        this.PrimeVideoRequisition = PrimeVideoRequisition;
        this.microsoftStoreRequisition = microsoftStoreRequisition;
        this.OtherSoftwareRequisitions = OtherSoftwareRequisitions;
    }

    public void salary() {
        System.out.println("Salary balance: " + String.format("%.2f", salary));
    }

    public void petrolAllowance() {
        System.out.println("\t" + "Petrol Allowance.");
    }

    public void houseAllowance() {
        System.out.println("\t" + "House Allowance.");
    }

    public void studyFeesAllowance() {
        System.out.println("\t" + "Study Fees.");
    }

    public void otherAllowances() {
        System.out.println("\t" + "Other Allowances.");
    }

    public void userOptions(){
        System.out.println("Available options.");
        System.out.println("""
                1 - House Allowance.
                2 - Study Fees.
                3 - Petrol Allowance.
                4 - Other Allowances.
                5 - Quit the application.""");
    }

    public void requisition() {
        Scanner request = new Scanner(System.in);
        System.out.println("Would you like to claim the company benefits.");
        System.out.println("Payment will be deposited into the company employee account.");
        answer = request.nextLine();

        if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("YeS") || (answer.equals("yEs") || (answer.equals("YEs") ||
                (answer.equals("yES") || (answer.equals("yeS") || (answer.equals("YES") || (answer.equals("Y") || (answer.equals("y"))))))))))) {
            while (!processing) {
                userOptions();
                System.out.println("\t");
                System.out.println("Please choose your option using only the digits 1 to 5?");
                commodity = request.nextInt();
                request.nextLine();

                switch (commodity) {
                    case 1 -> {
                        System.out.println("You can only request 30000.");
                        System.out.println("Please enter an amount of 30000?");
                        house = request.nextDouble();
                        request.nextLine();
                        if (house == 30000) {
                            System.out.println("\t");
                            System.out.println("House Allowance available balance: " + String.format("%.2f", house));
                            System.out.println("House Allowance balance: " + String.format("%.2f", houseAllowance -= house));
                            System.out.println("\t");
                            System.out.println("Would you like to make another requisition?");
                            answer = request.nextLine();
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("YeS") || (answer.equals("yEs") || (answer.equals("YEs") ||
                                    (answer.equals("yES") || (answer.equals("yeS") || (answer.equals("YES") || (answer.equals("Y") || (answer.equals("y"))))))))))) {
                                if(this.houseAllowance == 7970000) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Benefit will be deposited into the company employee account.");
                                    System.out.println("Salary has been deposited into your account. Thank your for your service.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            }
                        } else {
                            System.out.println("The house allowance transactions only accept a 30000 requisition.");
                            System.out.println("Please enter an amount of 30000.");
                            house = request.nextDouble();
                            request.nextLine();
                            if (house == 30000) {
                                System.out.println("\t");
                                System.out.println("House Allowance available balance: " + String.format("%.2f", house));
                                System.out.println("House Allowance balance: " + String.format("%.2f", houseAllowance -= house) + "\n");

                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n" +
                                        "Salary has been deposited into your account. Thank your for your service.");
                            }
                            processing = true;
                        }
                    }
                    case 2 -> {
                        System.out.println("You can only request 35000.");
                        System.out.println("Please enter an amount of 35000?");
                        study = request.nextDouble();
                        request.nextLine();
                        if (study == 35000) {
                            System.out.println("\t");
                            System.out.println("Study fees available balance: " + String.format("%.2f", study));
                            System.out.println("Study fees balance: " + String.format("%.2f", studyFeesAllowance -= study));
                            System.out.println("\t");
                            System.out.println("Would you like to make another requisition?");
                            answer = request.nextLine();
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("YeS") || (answer.equals("yEs") || (answer.equals("YEs") ||
                                    (answer.equals("yES") || (answer.equals("yeS") || (answer.equals("YES") || (answer.equals("Y") || (answer.equals("y"))))))))))) {
                                if(this.studyFeesAllowance == 1465000) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Benefit will be deposited into the company employee account.");
                                    System.out.println("Salary has been deposited into your account. Thank your for your service.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            }
                        } else {
                            System.out.println("Study fees transactions only accept a 35000 requisition.");
                            System.out.println("Please enter an amount of 35000.");
                            study = request.nextDouble();
                            request.nextLine();
                            if (study == 35000) {
                                System.out.println("\t");
                                System.out.println("Study fees available balance: " + String.format("%.2f", study));
                                System.out.println("Study fees balance: " + String.format("%.2f", studyFeesAllowance -= study) + "\n");

                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n" +
                                        "Salary has been deposited into your account. Thank your for your service.");
                            }
                            processing = true;
                        }
                    }
                    case 3 -> {
                        System.out.println("You can only request 1500.");
                        System.out.println("Please enter an amount of 1500?");
                        petrol = request.nextDouble();
                        request.nextLine();
                        if (petrol == 1500) {
                            System.out.println("\t");
                            System.out.println("Petrol available balance: " + String.format("%.2f", petrol));
                            System.out.println("Petrol balance: " + String.format("%.2f", petrolAllowance -= petrol));
                            System.out.println("\t");
                            System.out.println("Would you like to make another requisition?");
                            answer = request.nextLine();
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("YeS") || (answer.equals("yEs") || (answer.equals("YEs") ||
                                    (answer.equals("yES") || (answer.equals("yeS") || (answer.equals("YES") || (answer.equals("Y") || (answer.equals("y"))))))))))) {
                                if(this.petrolAllowance == 98500) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Benefit will be deposited into the company employee account.");
                                    System.out.println("Salary has been deposited into your account. Thank your for your service.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            }
                        } else {
                            System.out.println("Petrol transactions only accept 1500 requisition.");
                            System.out.println("Please enter an amount of 1500.");
                            petrol = request.nextDouble();
                            request.nextLine();
                            if(petrol == 1500) {
                                System.out.println("\t");
                                System.out.println("Petrol fees available balance: " + String.format("%.2f", petrol));
                                System.out.println("Petrol balance: " + String.format("%.2f", petrolAllowance -= petrol) + "\n");

                                System.out.println("Benefit will be deposited into the company employee account.");
                                System.out.println("Salary has been deposited into your account. Thank your for your service.");
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n" +
                                        "Salary has been deposited into your account. Thank your for your service.");
                            }
                            processing = true;
                        }
                    }
                    case 4 -> {
                        System.out.println("\t");
                        System.out.println("Other allowances scale is measured based on the product you requested.");
                        System.out.println("The voucher code will be sent to your phone or e-mail.");
                        System.out.println("\t");
                        System.out.println("""
                                The available products are as follows:
                                Lunch
                                Salon
                                Uber
                                Uber eats
                                iTunes
                                App Store
                                Ster-Kinekor
                                netflix
                                Play Store
                                Play music
                                Showmax
                                Prime Video
                                Microsoft Store
                                Other Software""");
                        System.out.println("What would you like to request?");
                        otherCommodity = request.nextLine();
                        System.out.println("\t");
                        switch (otherCommodity) {
                            case "Lunch" -> System.out.println("Lunch voucher available balance: " + String.format("%.2f", lunchRequisition) + "\n");
                            case "Salon" -> System.out.println("Salon voucher available balance: " + String.format("%.2f", salonRequisition) + "\n");
                            case "Uber" -> System.out.println("Uber voucher available balance: " + String.format("%.2f", uberRequisition) + "\n");
                            case "Uber eats" -> System.out.println("Uber eats voucher available balance: " + String.format("%.2f", uberEatsRequisition) + "\n");
                            case "iTunes" -> System.out.println("iTunes voucher available balance: " + String.format("%.2f", iTunesRequisition) + "\n");
                            case "App Store" -> System.out.println("App Store voucher available balance: " + String.format("%.2f", appleStoreRequisition) + "\n");
                            case "Ster-Kinekor" -> System.out.println("Ster-Kinekor voucher available balance: " + String.format("%.2f", sterKinekorRequisition) + "\n");
                            case "netflix" -> System.out.println("netflix voucher available balance: " + String.format("%.2f", netflixRequisition) + "\n");
                            case "Play Store" -> System.out.println("Play Store voucher available balance: " + String.format("%.2f", playStoreRequisition) + "\n");
                            case "Play music" -> System.out.println("Play music voucher available balance: " + String.format("%.2f", playMusicRequisition) + "\n");
                            case "Showmax" -> System.out.println("Showmax voucher available balance: " + String.format("%.2f", showmaxRequisition) + "\n");
                            case "Prime Video" -> System.out.println("Prime Video voucher available balance: " + String.format("%.2f", PrimeVideoRequisition) + "\n");
                            case "Microsoft Store" -> System.out.println("Microsoft Store voucher available balance: " + String.format("%.2f", microsoftStoreRequisition) + "\n");
                            case "Other Software" -> System.out.println("Other Software voucher available balance: " + String.format("%.2f", OtherSoftwareRequisitions) + "\n");
                            default -> {
                                System.out.println("Unavailable requisition. Please type an available requisition." + "\n");
                                System.out.println("""
                                        The available products are as follows:
                                        Lunch
                                        Salon
                                        Uber
                                        Uber eats
                                        iTunes
                                        App Store
                                        Ster-Kinekor
                                        netflix
                                        Play Store
                                        Play music
                                        Showmax
                                        Prime Video
                                        Microsoft Store
                                        Other Software""");
                                System.out.println("Please choose a product?");
                                otherCommodity = request.nextLine();
                                System.out.println("\t");
                                switch (otherCommodity) {
                                    case "Lunch" -> System.out.println("Lunch voucher available balance: " + String.format("%.2f", lunchRequisition) + "\n");
                                    case "Salon" -> System.out.println("Salon voucher available balance: " + String.format("%.2f", salonRequisition) + "\n");
                                    case "Uber" -> System.out.println("Uber voucher available balance: " + String.format("%.2f", uberRequisition) + "\n");
                                    case "Uber eats" -> System.out.println("Uber eats voucher available balance: " + String.format("%.2f", uberEatsRequisition) + "\n");
                                    case "iTunes" -> System.out.println("iTunes voucher available balance: " + String.format("%.2f", iTunesRequisition) + "\n");
                                    case "App Store" -> System.out.println("App Store voucher available balance: " + String.format("%.2f", appleStoreRequisition) + "\n");
                                    case "Ster-Kinekor" -> System.out.println("Ster-Kinekor voucher available balance: " + String.format("%.2f", sterKinekorRequisition) + "\n");
                                    case "netflix" -> System.out.println("netflix voucher available balance: " + String.format("%.2f", netflixRequisition) + "\n");
                                    case "Play Store" -> System.out.println("Play Store voucher available balance: " + String.format("%.2f", playStoreRequisition) + "\n");
                                    case "Play music" -> System.out.println("Play music voucher available balance: " + String.format("%.2f", playMusicRequisition) + "\n");
                                    case "Showmax" -> System.out.println("Showmax voucher available balance: " + String.format("%.2f", showmaxRequisition) + "\n");
                                    case "Prime Video" -> System.out.println("Prime Video voucher available balance: " + String.format("%.2f", PrimeVideoRequisition) + "\n");
                                    case "Microsoft Store" -> System.out.println("Microsoft Store voucher available balance: " + String.format("%.2f", microsoftStoreRequisition) + "\n");
                                    case "Other Software" -> System.out.println("Other Software voucher available balance: " + String.format("%.2f", OtherSoftwareRequisitions) + "\n");
                                    default -> System.out.println("Goodbye!!! keep away from the streets." + "\n");
                                }
//                                processing = true;
                            }
                        }
                        if(otherCommodity.equals("Lunch") || otherCommodity.equals("Salon") || otherCommodity.equals("Uber") ||
                                otherCommodity.equals("Uber eats") || otherCommodity.equals("iTunes") || otherCommodity.equals("App Store") ||
                                otherCommodity.equals("Ster-Kinekor") || otherCommodity.equals("netflix") || otherCommodity.equals("Play Store") ||
                                otherCommodity.equals("Play music") || otherCommodity.equals("Showmax") || otherCommodity.equals("Prime Video") ||
                                otherCommodity.equals("Microsoft Store") || otherCommodity.equals("Other Software")) {
                            processing = true;
                            System.out.println("Voucher has been sent to your e-mail.");
                        } else {
                            processing = true;
                        }

                    }
                    case 5 -> {
                        processing = true;
                        System.out.println("Salary has been deposited into your account. Thank your for your service.");
                    }
                    default -> {
                        processing = true;
                        System.out.println("You have to attend proper reading lessons. Goodbye!!!" + "\n");
                    }
                }
            }
        } else {
            System.out.println("Salary has been deposited into your account. Thank your for your service.");
        }
    }

    public void finalRequisition() {
        if(house == 30000 || study == 35000 || petrol == 1500) {
            System.out.println("House Allowance available balance: " + String.format("%.2f", house));
            System.out.println("Study fees available balance: " + String.format("%.2f", study));
            System.out.println("Petrol available balance: " + String.format("%.2f", petrol));
        } else {
            System.out.println("House Allowance available balance: " + String.format("%.2f", 0.00));
            System.out.println("Study fees available balance: " + String.format("%.2f", 0.00));
            System.out.println("Petrol available balance: " + String.format("%.2f", 0.00));
        }
    }

    public double decemberDerivativeThree() {
        if(equaliser.getAvailableBalance() == salary ) {
            return equaliser.getAvailableBalance() / 100 * 1.8;
        } else if(equaliser.getAvailableBalance() == salary + bonus) {
            return equaliser.getAvailableBalance() / 100 * 1.8;
        } else {
            return 0;
        }
    }

    public void synthesisThree(String newMonthPhase) {
        int currentMonth = planetaryMonth.getMonths().indexOf(newMonthPhase);
        if(currentMonth >= 0) {
            System.out.println("Monies deducted in " + planetaryMonth.getMonths().get(currentMonth) + ".");
            System.out.println("Medical Insurance deducted: " + String.format("%.2f", decemberDerivativeThree()));
            System.out.println("Funeral Insurance deducted: " + String.format("%.2f", decemberDerivativeThree()));
        } else {
            System.out.println("The accession is avoidable.");
        }
    }

    public double getMedicalInsurance() {
        return medicalInsurance;
    }

    public double getFuneralAllowance() {
        return funeralAllowance;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public MonthsOfTheYear getPlanetaryMonth() {
        return planetaryMonth;
    }
}
