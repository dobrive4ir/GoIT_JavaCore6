package javacore.module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * Implementation of BankSystem interface
 */

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        int commission = user.getBank().getCommission(amount);
        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        if (amount <= 0) {
            System.out.println("Error: Set amount of withdrawal");
        } else if ((amount + (amount * (commission * 0.01))) > (double) limitOfWithdrawal) {
            System.out.println("Error: Maximum withdrawal amount is " + limitOfWithdrawal + " including a commission " +
                    commission + "%");
        } else if ((amount + (amount * (commission * 0.01))) > user.getBalance()) {
            System.out.println("Error: Current user have not enough funds to complete withdrawal");
        } else if ((amount + (amount * (commission * 0.01))) <= (double) user.getBank().getTotalCapital()) {
            user.setBalance(user.getBalance() - (amount + (amount * (commission * 0.01))));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        int commission = user.getBank().getCommission(amount);
        int limitOfFunding = user.getBank().getLimitOfFunding();
        if (amount <= 0) {
            System.out.println("Error: Set amount of funding");
        } else if (amount > limitOfFunding) {
            System.out.println("Error: Maximum funding amount is " + user.getBank().getLimitOfFunding());
        } else {
            user.setBalance(user.getBalance() + (amount - (amount * (commission) * 0.01)));
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        int commission = fromUser.getBank().getCommission(amount);
        if (amount <= 0) {
            System.out.println("Error: Set transfer amount");
        } else if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency()) {
            System.out.println("Error: Users banks works with different currency");
        } else if ((amount + (amount * (commission * 0.01))) > fromUser.getBalance()) {
            System.out.println("Error: " + fromUser.getName() + " have not enough funds to complete transfer");
        } else if (fromUser == toUser) {
            System.out.println("Error: Input different users");
        } else {
            fromUser.setBalance(fromUser.getBalance() - (amount + (amount * (commission * 0.01))));
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

}
