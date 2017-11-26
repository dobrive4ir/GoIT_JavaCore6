package javacore.module6.task3;

import javacore.module6.task2.User;

import java.util.ArrayList;
import java.util.List;

public final class UserUtils {

    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        if (users == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            }
            for (int j = 0; j < users.length; j++) {
                if ((users[i] != users[j]) && (users[i].equals(users[j]))) {
                    users[j] = null;
                }
            }
        }
        return deleteEmptyUsers(users);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        if (users == null) {
            throw new NullPointerException();
        }

        List<User> usersWithContitionalBalance = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    usersWithContitionalBalance.add(user);
                }
            }
        }
        return usersWithContitionalBalance.toArray(new User[usersWithContitionalBalance.size()]);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        if (users == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                User userNew = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(),
                        users[i].getBalance() + users[i].getSalary());
                users[i] = userNew;
            }
        }
        return users;
    }

    public static final Long[] getUsersId(User[] users) {
        if (users == null) {
            throw new NullPointerException();
        }

        List<Long> idList = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                idList.add(user.getId());
            }
        }
        return idList.toArray(new Long[idList.size()]);
    }

    public static User[] deleteEmptyUsers(User[] users) {
        if (users == null) {
            throw new NullPointerException();
        }

        List<User> userList = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                userList.add(user);
            }
        }
        return userList.toArray(new User[userList.size()]);
    }

}
