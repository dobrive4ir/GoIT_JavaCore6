package javacore.module7.task2;

import javacore.module4.Currency;
import javacore.module7.task1.Order;
import javacore.module7.task1.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains main(){} method, which tests all the operations with Orders list in accordance to the task 2.
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

        List<Order> orderList = new ArrayList<>();
        Order order1 = new Order(2001, 1500, Currency.USD, "Nikon S22", "Ebay", user1);
        orderList.add(order1);
        Order order2 = new Order(2002, 3000, Currency.EUR, "Nikon S300", "Amazon", user2);
        orderList.add(order2);
        Order order3 = new Order(2003, 4500, Currency.USD, "Asus Z35", "Alli", user3);
        orderList.add(order3);
        Order order4 = new Order(2004, 5000, Currency.USD, "Acer M80", "Ebay", user4);
        orderList.add(order4);
        Order order5 = new Order(2005, 7000, Currency.EUR, "Asus JM20", "Alli", user5);
        orderList.add(order5);
        Order order6 = new Order(2006, 1600, Currency.USD, "Samsung S7", "Amazon", user6);
        orderList.add(order6);
        Order order7 = new Order(2007, 2900, Currency.EUR, "Tavriya", "Amazon", user7);
        orderList.add(order7);
        Order order8 = new Order(2008, 1400, Currency.EUR, "Jiguli", "Ebay", user8);
        orderList.add(order8);
        Order order9 = new Order(2002, 3000, Currency.EUR, "Niva", "Amazon", user9);
        orderList.add(order9);
        Order order10 = new Order(2003, 4500, Currency.USD, "Volga", "Alli", user10);
        orderList.add(order10);

        System.out.println("ORIGINAL LIST:");
        System.out.println(orderList);

        System.out.println("\nORDERS SORTED BY PRICE DECREASE:");
        OrderUtils2.inversePriceSort(orderList);
        System.out.println(orderList);

        System.out.println("\nORDERS SORTED BY PRICE AND USER'S CITY:");
        OrderUtils2.priceCitySort(orderList);
        System.out.println(orderList);

        System.out.println("\nORDERS SORTED BY ITEM NAME, SHOP IDENTIFICATOR AND USER'S CITY:");
        OrderUtils2.itemNameShopIdentificatorCitySort(orderList);
        System.out.println(orderList);
    }

}