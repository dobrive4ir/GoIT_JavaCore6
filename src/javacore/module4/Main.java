package javacore.module4;

import java.math.BigDecimal;

/**
 * Created by Dobryvechir on 23.02.2017.
 * Create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
 * Run four different operations with every User’s balance and print its objects to console.
 */
public class Main {

    public static void main(String[] args) {
    /*
     Creation of banks and users
    */
        Bank[] banksArray = new Bank[6];
        User[] usersArray = new User[6];
        String[] usersNameArray = {"Sandy_Robinson", "Paul_Smith", "Hanna_Shnaider", "Arnold_Muller", "Deming_Zhang",
                "Xiaoming_Li"};
        String[] companiesNameArray = {"Walmart", "IBM", "Volkswagen", "Siemens", "Lenovo Group", "Sinopec Group"};
        Currency currencySwitcher;
        for (int i = 0; i < banksArray.length; i++) {
            currencySwitcher = ((i % 2) == 0) ? Currency.USD : Currency.EUR;
            if (i == 0 || i == 1) {
                banksArray[i] = new USBank((long) (Math.random() * 1000000 + 500000), "USA", currencySwitcher,
                        (int) (Math.random() * 300 + 150), BigDecimal.valueOf(Math.random() * 3000 + 2000)
                        .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(), (long) (Math.random() * 70 + 40),
                        (long) (Math.random() * 1000000000 + 500000000));
                usersArray[i] = new User((long) (Math.random() * 100000 + 50000), usersNameArray[i],
                        BigDecimal.valueOf(banksArray[i].getAvrSalaryOfEmployee() * 36).setScale(2, BigDecimal.ROUND_HALF_UP)
                        .doubleValue(), (int) (Math.random() * 36 + 12), companiesNameArray[i],
                        (int) banksArray[i].getAvrSalaryOfEmployee(), banksArray[i]);
            } else if (i == 2 || i == 3) {
                banksArray[i] = new EUBank((long) (Math.random() * 2000000 + 1000000), "Germany", currencySwitcher,
                        (int) (Math.random() * 300 + 150), BigDecimal.valueOf(Math.random() * 5000 + 3000)
                        .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(), (long) (Math.random() * 80 + 50),
                        (long) (Math.random() * 2000000000 + 1000000000));
                usersArray[i] = new User((long) (Math.random() * 200000 + 100000), usersNameArray[i],
                        BigDecimal.valueOf(banksArray[i].getAvrSalaryOfEmployee() * 36).setScale(2, BigDecimal.ROUND_HALF_UP)
                        .doubleValue(), (int) (Math.random() * 36 + 12), companiesNameArray[i],
                        (int) banksArray[i].getAvrSalaryOfEmployee(), banksArray[i]);
            } else if (i == 4 || i == 5) {
                banksArray[i] = new ChinaBank((long) (Math.random() * 3000000 + 1500000), "China", currencySwitcher,
                        (int) (Math.random() * 300 + 150), BigDecimal.valueOf(Math.random() * 3000 + 1000)
                        .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(), (long) (Math.random() * 50 + 30),
                        (long) (Math.random() * 100000000 + 50000000));
                usersArray[i] = new User((long) (Math.random() * 300000 + 150000), usersNameArray[i],
                        BigDecimal.valueOf(banksArray[i].getAvrSalaryOfEmployee() * 36).setScale(2, BigDecimal.ROUND_HALF_UP)
                        .doubleValue(), (int) (Math.random() * 36 + 12), companiesNameArray[i],
                        (int) banksArray[i].getAvrSalaryOfEmployee(), banksArray[i]);
            }
        }
    /*
     Bank system test
     */
        BankSystemImpl bankSystemTest = new BankSystemImpl();
        for (int i = 0; i < usersArray.length; i++) {
            String userName = usersArray[i].getName();
            double userBalance = usersArray[i].getBalance();
            Currency userCurrency = usersArray[i].getBank().getCurrency();
            System.out.println(usersArray[i]);
            System.out.println("\n WITHDRAWAL");
            bankSystemTest.withdrawOfUser(usersArray[i], (int) (Math.random() * 2301));
            System.out.println("Now " + userName + " balance is: " + userBalance + userCurrency);
            System.out.println("\n FUNDING");
            bankSystemTest.fundUser(usersArray[i], (int) (Math.random() * 20002));
            System.out.println("Now " + userName + " balance is: " + userBalance + userCurrency);
            System.out.println("\n TRANSFER");
            bankSystemTest.transferMoney(usersArray[i], usersArray[(int) (Math.random() * 6)],
                    (int) (Math.random() * 40000 + 30000));
            System.out.println("Now " + userName + " balance is: " + userBalance + userCurrency);
            System.out.println("\n PAY SALARY");
            bankSystemTest.paySalary(usersArray[i]);
            System.out.println("Now " + userName + " balance is: " + userBalance + userCurrency);
            System.out.println("\n=================================================================================\n");
        }
    }

}