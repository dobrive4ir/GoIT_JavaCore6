package javacore.module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * User should have following fields:
 * <p>
 * long id
 * String name
 * double balance
 * int monthsOfEmployment
 * String companyName
 * int salary
 * Bank bank
 * <p>
 * Generate getters and setters. And create constructor with all fields.
 * User does not have its own methods. But overrides toString method.
 */

public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary,
                Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void printBalance () {
        System.out.println("Now " + getName() + " balance is: " + getBalance() + getBank().getCurrency());
    }

    @Override
    public String toString() {
        return name + " personal data {" + "id: " + id + ";  balance: " + balance + getBank().getCurrency() +
                ";  months of employment: " + monthsOfEmployment + ";  company name: \"" + companyName +
                "\";  salary: " + salary + ";  bank: \"" + getBank().getClass().getSimpleName() + "\"}";
    }
}
