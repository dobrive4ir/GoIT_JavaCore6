package javacore.module7.task3;

import javacore.module4.Currency;
import javacore.module7.task1.Order;
import javacore.module7.task1.User;

import java.util.TreeSet;

/**
 * Class contains main(){} method, which tests all the operations with Orders set in accordance to the task 3.
 */

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1001, "Petr", "Petrov", "Paris", 10000);
        User user2 = new User(1002, "Bob", "Dilan", "London", 20000);
        User user3 = new User(1003, "Tim", "Scotly", "Brovary", 30000);
        User user4 = new User(1004, "Tod", "Bear", "London", 40000);
        User user5 = new User(1005, "Ann", "Umbers", "Kiev", 50000);
        User user6 = new User(1006, "Meg", "Rayan", "Paris", 60000);
        User user7 = new User(1007, "Ron", "Wizly", "Kiev", 70000);
        User user8 = new User(1008, "Ash", "Flash", "London", 80000);
        User user9 = new User(1009, "Zet", "Cry", "Paris", 90000);
        User user10 = new User(1010, "Ori", "Dory", "Kiev", 1000);

        TreeSet<Order> orderSet = new TreeSet<>();
        Order order1 = new Order(4001, 1500, Currency.USD, "Nikon S22", "Ebay", user1);
        orderSet.add(order1);
        Order order2 = new Order(2002, 3000, Currency.EUR, "Nikon S300", "Amazon", user2);
        orderSet.add(order2);
        Order order3 = new Order(3003, 4500, Currency.USD, "Asus Z35", "Alli", user3);
        orderSet.add(order3);
        Order order4 = new Order(4004, 5000, Currency.USD, "Acer M80", "Ebay", user4);
        orderSet.add(order4);
        Order order5 = new Order(3005, 7000, Currency.EUR, "Asus JM20", "Alli", user5);
        orderSet.add(order5);
        Order order6 = new Order(2006, 1600, Currency.USD, "Samsung S7", "Amazon", user6);
        orderSet.add(order6);
        Order order7 = new Order(2007, 2900, Currency.EUR, "Tavriya", "Amazon", user7);
        orderSet.add(order7);
        Order order8 = new Order(4008, 1400, Currency.EUR, "Jiguli", "Ebay", user8);
        orderSet.add(order8);
        Order order9 = new Order(2009, 3000, Currency.EUR, "Niva", "Amazon", user9);
        orderSet.add(order9);
        Order order10 = new Order(3003, 4500, Currency.USD, "Asus Z35", "Alli", user3);
        orderSet.add(order10);

        System.out.println("ORIGINAL TREESET:");
        System.out.println(orderSet);

        System.out.println("\nCHEKING FOR USER WITH LAST NAME 'Petrov':");
        System.out.println(OrderUtils3.checkTheLastName(orderSet, "Petrov"));

        System.out.print("\nORDER WITH HIGHEST PRICE:");
        System.out.println(OrderUtils3.highestPriceOrder(orderSet));

        System.out.println("\nTREESET WITHOUT 'USD' ORDERS:");
        OrderUtils3.deleteCurrency(orderSet, Currency.USD);
        System.out.println(orderSet);

    }

}