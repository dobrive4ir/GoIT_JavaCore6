package module3.hw4;

/**
 * Created by Dobryvechir on 16.02.2017.
 * Создайте класс User со следующими полями:
 * String name,
 * int balance,
 * int monthsOfEmployment,
 * String companyName,
 * int salary,
 * String currency.
 * <p>
 * Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
 * Напишите методы:
 * void paySalary() - добавляет заработную плату к балансу пользователя
 * withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 * companyNameLenght - вычисляет длину имя компании
 * monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 */

public class User {

    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(){
        this.balance += this.salary;
    }

    public void withdraw(int summ){
        double commission = 0.1;
        if (summ < 1000){
            commission = 0.05;
        }
        this.balance -= summ + (summ * commission);
    }

    public int companyNameLenght (){
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
