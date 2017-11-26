package javacore.module6.task3;

import javacore.module6.task2.User;

import java.util.Arrays;

public class UserMain {

    public static void main(String[] args) {
        User user1 = new User(1, "James", "Smith", 100, 0);
        User user2 = new User(2, "Sarah", "Konor", 200, 100);
        User user3 = new User(1, "James", "Smith", 100, 0);
        User user4 = new User(3, "Mark", "Smith", 50, 150);
        User user5 = new User(4, "James", "Konor", 10, 0);
        User user6 = new User(1, "James", "Smith", 100, 0);

        User[] users = {user1, user2, null, user3, null, user4, user5, user6, null, null};

        System.out.println("Inputed array:" + Arrays.toString(users));
        System.out.println("Delete Empty users:" + Arrays.toString(users = UserUtils.deleteEmptyUsers(users)));
        System.out.println("Unique users: " + Arrays.toString(users = UserUtils.uniqueUsers(users)));
        System.out.println("Users Id: " + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("Users after salary: " + Arrays.toString(users = UserUtils.paySalaryToUsers(users)));
        System.out.println("Users with balance: " + Arrays.toString(UserUtils.usersWithContitionalBalance(users, 100)));
    }
}