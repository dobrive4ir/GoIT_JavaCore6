package javacore.module3.hw4;

/**
 * Created by Dobryvechir on 16.02.2017.
 */

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Vitaly", 900, 10, "Kievenergo",
                300, "$");
        System.out.println("Balance before funding: " + user1.getBalance());

        user1.paySalary();
        System.out.println("Balance after funding: " + user1.getBalance());

        user1.withdraw(250);
        System.out.println("Balance after withdraw: " + user1.getBalance());

        System.out.println("Company " + user1.getCompanyName() + " have " + user1.companyNameLenght() + " chars in name");

        System.out.println("Your employment in company is " + user1.getMonthsOfEmployment());
        user1.monthIncreaser(5);
        System.out.println("Now your employment in company is " + user1.getMonthsOfEmployment());
    }
}
