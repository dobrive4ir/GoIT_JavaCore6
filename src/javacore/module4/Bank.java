package javacore.module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * Abstract class Bank should contain fields
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 * <p>
 * Generate getters and setters. And create constructor with all fields.
 * <p>
 * Methods are:
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
 */

public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract int getMonthlyRate();

    public abstract int getCommission(int summ);

    public double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

}
