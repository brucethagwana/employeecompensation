package com.bruce.thagwana;

public class Benefits {

    private double salary;
    private double bonus;
    private double medicalInsurance;
    private double petrolAllowance;
    private double houseAllowance;
    private double funeralAllowance;
    private double studyFeesAllowance;
    private double otherAllowances;
    private Balance accreditedBalance;

    public Benefits(double salary, double bonus, double medicalInsurance, double petrolAllowance, double houseAllowance,
                    double funeralAllowance, double studyFeesAllowance, double otherAllowances, Balance accreditedBalance,
                    MonthsOfTheYear monthsOfTheYear) {
        this.salary = salary;
        this.bonus = bonus;
        this.medicalInsurance = medicalInsurance;
        this.petrolAllowance = petrolAllowance;
        this.houseAllowance = houseAllowance;
        this.funeralAllowance = funeralAllowance;
        this.studyFeesAllowance = studyFeesAllowance;
        this.otherAllowances = otherAllowances;
        this.accreditedBalance = accreditedBalance;
    }

    public void Salary() {
        System.out.println("Salary available balance: " + salary);
    }

    public void Bonus() {
        System.out.println("Bonus balance: " + bonus);
    }

    public void MedicalInsurance() {
        System.out.println("Medical Insurance available balance: " + medicalInsurance);
    }

    public void PetrolAllowance() {
        System.out.println("Petrol Allowance available balance: " + petrolAllowance);
    }

    public void HouseAllowance() {
        System.out.println("House Allowance available balance: " + houseAllowance);
    }

    public void FuneralAllowance() {
        System.out.println("Funeral Allowance available balance: " + funeralAllowance);
    }

    public void StudyFeesAllowance() {
        System.out.println("Study Fees available balance: " + studyFeesAllowance);
    }

    public void OtherAllowances() {
        System.out.println("Other Allowances balance: " + otherAllowances);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setMedicalInsurance(double medicalInsurance) {
        System.out.println("Medical Insurance deducted: " + medicalInsurance);
        this.medicalInsurance = medicalInsurance;
    }

    public void setPetrolAllowance(double petrolAllowance) {
        this.petrolAllowance = petrolAllowance;
    }

    public void setHouseAllowance(double houseAllowance) {
        this.houseAllowance = houseAllowance;
    }

    public void setFuneralAllowance(double funeralAllowance) {
        System.out.println("Funeral Insurance deducted: " + funeralAllowance);
        this.funeralAllowance = funeralAllowance;
    }

    public void setStudyFeesAllowance(double studyFeesAllowance) {
        this.studyFeesAllowance = studyFeesAllowance;
    }

    public void setOtherAllowances(double otherAllowances) {
        this.otherAllowances = otherAllowances;
    }

    public void setAccreditedBalance(Balance accreditedBalance) {
        this.accreditedBalance = accreditedBalance;
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
}
