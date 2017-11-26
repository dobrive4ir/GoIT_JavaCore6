package javacore.module4;

/**
 * Created by Dobryvechir on 22.02.2017.
 * Create interface BankSystem with methods:
 * <p>
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 */

public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);

}
