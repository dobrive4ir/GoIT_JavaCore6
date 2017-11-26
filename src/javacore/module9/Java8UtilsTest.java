package javacore.module9;

import javacore.module4.Currency;
import javacore.module7.task1.Order;
import javacore.module7.task1.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8UtilsTest {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        fillOrderList(orders);
        testOrderList(orders);
    }

    private static void testOrderList(List<Order> orders) {
        List<List<Order>> listForGrouping;

        System.out.println("ORIGINAL ORDERS LIST:");
        System.out.println(orders);

        System.out.println("\nORDERS LIST SORTED BY PRICE DECREASE:");
        OrderUtilsByJava8.sortByPriceDecrease(orders);
        System.out.println(orders);

        System.out.println("\nORDERS LIST SORTED BY PRICE AND USER'S CITY:");
        OrderUtilsByJava8.sortByPriceAndCity(orders);
        System.out.println(orders);

        System.out.println("\nORDERS LIST SORTED BY ITEM NAME, SHOP IDENTIFICATOR AND USER'S CITY:");
        OrderUtilsByJava8.sortByItemNameIdCity(orders);
        System.out.println(orders);

        System.out.println("\nORDERS LIST WITHOUT DUPLICATES:\n" + OrderUtilsByJava8.deleteDuplicatedOrders(orders));

        System.out.println("\nORDERS LIST WITH ORDER PRICE >= 1500:\n" + OrderUtilsByJava8.filterOrdersByPrice(orders, 1500));

        System.out.println("\nORDERS LIST SEPARATED BY CURRENCY :");
        listForGrouping = OrderUtilsByJava8.groupOrdersByCurrencies(orders, Currency.EUR, Currency.USD);
        listForGrouping.forEach(System.out::println);

        System.out.println("\nORDERS LIST SEPARATED BY USER'S CITIES :");
        listForGrouping = OrderUtilsByJava8.groupOrdersByCities(orders);
        listForGrouping.forEach(System.out::println);

        System.out.println("\nCHEKING FOR USER WITH LAST NAME 'КОНОНОВ':\n" + OrderUtilsByJava8.checkForLastName(orders, "Кононов"));
        System.out.println("\nCHEKING FOR USER WITH LAST NAME 'КОНОНОВА':\n" + OrderUtilsByJava8.checkForLastName(orders, "Кононова"));

        System.out.println("\nORDERS LIST WITHOUT 'USD' ORDERS:");
        OrderUtilsByJava8.removeOrdersByCurrencies(orders, Currency.USD);
        System.out.println(orders);

    }

    private static void fillOrderList(List<Order> orderList) {

        User user0 = new User(2446, "Виктор", "Суханов", "Киев", 54897);
        User user1 = new User(5657, "Антонина", "Пахомова", "Львов", 5679);
        User user2 = new User(32545, "Анна", "Третьякова", "Чернигов", 12345);
        User user3 = new User(45676, "Михаил", "Яковлев", "Черкасы", 8879);
        User user4 = new User(343465, "Нинель", "Авдеева", "Кропивницкий", 7526);
        User user5 = new User(6865, "Нина", "Блинова", "Киев", 79532);
        User user6 = new User(34665, "Ангелина", "Матвеева", "Ровно", 5413);
        User user7 = new User(34546, "Екатерина", "Денисова", "Чернигов", 2036);
        User user8 = new User(3466557, "Бронислав", "Кононов", "Чернигов", 7104);
        User user9 = new User(8875656, "Алина", "Афанасьева", "Киев", 9605);

        Order order0 = new Order(214, 785432, Currency.USD, "itemName0", "qwe", user0);
        Order order1 = new Order(89446, 1200, Currency.USD, "itemName1", "asd", user1);
        Order order2 = new Order(87213, 54487, Currency.USD, "itemName2", "zxc", user2);
        Order order3 = new Order(89791, 800, Currency.USD, "itemName3", "rty", user3);
        Order order4 = new Order(98711, 1000, Currency.USD, "itemName4", "fgh", user4);
        Order order5 = new Order(872, 329841, Currency.EUR, "itemName5", "vbn", user5);
        Order order6 = new Order(78945, 7841, Currency.EUR, "itemName6", "uio", user6);
        Order order7 = new Order(3214, 9852, Currency.EUR, "itemName7", "jkl", user7);
        Order order8 = new Order(684123, 987, Currency.EUR, "itemName8", "mnb", user8);
        Order order9 = new Order(766, 153, Currency.EUR, "duplicate1", "dup", user9);
        Order order10 = new Order(765, 153, Currency.EUR, "duplicate", "dup", user9);
        Order order11 = new Order(765, 153, Currency.EUR, "duplicate", "dup", user9);

        orderList.addAll(Arrays.asList(order0, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10, order11));
    }
}
