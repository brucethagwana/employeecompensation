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
    private final double otherAllowances;
    private final MonthsOfTheYear planetaryMonth;
    private final Balance equaliser;
    double house, study, petrol;

    public Benefits(double salary, double bonus, double medicalInsurance, double petrolAllowance, double houseAllowance,
                    double funeralAllowance, double studyFeesAllowance, double otherAllowances, MonthsOfTheYear planetaryMonth,
                    Balance equaliser) {
        this.salary = salary;
        this.bonus = bonus;
        this.medicalInsurance = medicalInsurance;
        this.petrolAllowance = petrolAllowance;
        this.houseAllowance = houseAllowance;
        this.funeralAllowance = funeralAllowance;
        this.studyFeesAllowance = studyFeesAllowance;
        this.otherAllowances = otherAllowances;
        this.planetaryMonth = planetaryMonth;
        this.equaliser = equaliser;
    }

    public void Salary() {
        System.out.println("Salary balance: " + String.format("%.2f", salary));
    }

    public void PetrolAllowance() {
        System.out.println("\t" + "Petrol Allowance.");
    }

    public void HouseAllowance() {
        System.out.println("\t" + "House Allowance.");
    }

    public void StudyFeesAllowance() {
        System.out.println("\t" + "Study Fees.");
    }

    public void OtherAllowances() {
        System.out.println("\t" + "Other Allowances.");
    }

    public void userOptions(){
        System.out.println("Available options.");
        System.out.println("""
                1 - House Allowance.
                2 - Study Fees.
                3 - Petrol Allowance.
                4 - Other Allowances.
                5 - Quit the application""");
    }

    public void requisition() {
        Scanner request = new Scanner(System.in);
        double lunchRequisition = 200;
        double salonRequisition = 3500;
        double uberRequisition = 1000;
        double uberEatsRequisition = 300;
        double iTunesRequisition = 1000;
        double appleStoreRequisition = 1000;
        double sterKinekorRequisition = 600;
        double netflixRequisition = 600;
        double playStoreRequisition = 500;
        double playMusicRequisition = 500;
        double microsoftStoreRequisition = 500;
        double OtherSoftwareRequisitions = 15000;
        int commodity;
        String otherCommodity;
        String answer;
        boolean processing = false;

        System.out.println("Would you like to claim the company benefits.");
        System.out.println("Payment will be deposited into the company employee card.");
        answer = request.nextLine();

        if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("Y") || (answer.equals("y"))))) {
            while (!processing) {
                userOptions();
                System.out.println("\t");
                System.out.println("Please choose your option?");
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
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("Y") || (answer.equals("y"))))) {
                                if(this.houseAllowance == 7970000) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Payment will be deposited into the company employee card.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Payment will be deposited into the company employee card.");
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
                                processing = true;
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("You can only request 35000.");
                        System.out.println("Please enter an amount of 35000?");
                        study = request.nextDouble();
                        request.nextLine();
                        if (study >= 35000) {
                            System.out.println("\t");
                            System.out.println("Study fees available balance: " + String.format("%.2f", study));
                            System.out.println("Study fees balance: " + String.format("%.2f", studyFeesAllowance -= study));
                            System.out.println("\t");
                            System.out.println("Would you like to make another requisition?");
                            answer = request.nextLine();
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("Y") || (answer.equals("y"))))) {
                                if(this.studyFeesAllowance <= 1465000) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Payment will be deposited into the company employee card.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Payment will be deposited into the company employee card.");
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
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("You can only request 1500.");
                        System.out.println("Please enter an amount of 1500?");
                        petrol = request.nextDouble();
                        request.nextLine();
                        if (petrol >= 1500) {
                            System.out.println("\t");
                            System.out.println("Petrol available balance: " + String.format("%.2f", petrol));
                            System.out.println("Petrol balance: " + String.format("%.2f", petrolAllowance -= petrol));
                            System.out.println("\t");
                            System.out.println("Would you like to make another requisition?");
                            answer = request.nextLine();
                            if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("Y") || (answer.equals("y"))))) {
                                if(this.petrolAllowance <= 98500) {
                                    processing = true;
                                    System.out.println("Sorry, you are no longer allowed to make a requisition. " + "\n" +
                                            "Payment will be deposited into the company employee card.");
                                }
                            } else {
                                processing = true;
                                System.out.println("Payment will be deposited into the company employee card.");
                            }
                        } else {
                            System.out.println("Petrol transactions only accept 1500 requisition.");
                            System.out.println("Please enter an amount of 1500.");
                            petrol = request.nextDouble();
                            request.nextLine();
                            if (petrol == 1500) {
                                System.out.println("\t");
                                System.out.println("Petrol fees available balance: " + String.format("%.2f", petrol));
                                System.out.println("Petrol balance: " + String.format("%.2f", petrolAllowance -= petrol) + "\n");
                            } else {
                                System.out.println("Goodbye!!! keep away from the streets." + "\n");
                            }
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
                            case "Microsoft Store" -> System.out.println("Microsoft Store voucher available balance: " + String.format("%.2f", microsoftStoreRequisition) + "\n");
                            case "Other Software" -> System.out.println("Other Software voucher available balance: " + String.format("%.2f", OtherSoftwareRequisitions) + "\n");
                            default -> {
                                System.out.println("Unavailable requisition. Please enter an available requisition." + "\n");
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
                                    case "Microsoft Store" -> System.out.println("Microsoft Store voucher available balance: " + String.format("%.2f", microsoftStoreRequisition) + "\n");
                                    case "Other Software" -> System.out.println("Other Software voucher available balance: " + String.format("%.2f", OtherSoftwareRequisitions) + "\n");
                                    default -> System.out.println("Goodbye!!! keep away from the streets." + "\n");
                                }
                            }
                        }
                    }
                    case 5 -> {
                        processing = true;
                        System.out.println("Salary has been deposited into your account. Thank your for your service.");
                    }
                    default -> System.out.println("You have to attend proper reading lessons." + "\n");
                }
            }
        } else {
            System.out.println("Salary has been deposited into your account. Thank your for your service.");
        }
    }

    public void finalRequisition() {
            System.out.println("House Allowance available balance: " + String.format("%.2f", house));
            System.out.println("Study fees available balance: " + String.format("%.2f", study));
            System.out.println("Petrol available balance: " + String.format("%.2f", petrol));
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
