package javacore.module9;

import javacore.module4.Currency;
import javacore.module7.task1.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */

public final class OrderUtilsByJava8 {

    private OrderUtilsByJava8() {
    }

    public static void sortByPriceDecrease(List<Order> orderList) {
        orderList.sort(Comparator.comparingInt(Order::getPrice).reversed());
    }

    public static void sortByPriceAndCity(List<Order> orderList) {
        orderList.sort(Comparator.comparingInt(Order::getPrice)
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity())));
    }

    public static void sortByItemNameIdCity(List<Order> orderList) {
        orderList.sort(Comparator.comparing(Order::getItemName)
                .thenComparing(Comparator.comparingLong(Order::getId))
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity())));
    }

    public static List<Order> deleteDuplicatedOrders(List<Order> orderList) {
        return orderList.stream().distinct().collect(Collectors.toList());
    }

    public static List<Order> filterOrdersByPrice(List<Order> orderList, int priceCondition) {
        return orderList.stream().filter(order -> order.getPrice() >= priceCondition).collect(Collectors.toList());
    }

    public static List<List<Order>> groupOrdersByCurrencies(List<Order> orderList, Currency... currencies) {
        List<List<Order>> resultList = new ArrayList<>();

        Arrays.stream(currencies).distinct().forEach(operatingCurrency -> resultList.add(orderList.stream()
                .filter(order -> order.getCurrency() == operatingCurrency).collect(Collectors.toList())));

        return resultList;
    }

    public static List<List<Order>> groupOrdersByCities(List<Order> orderList) {
        List<List<Order>> resultList = new ArrayList<>();

        List<String> uniqueCities = orderList.stream().map(order -> order.getUser().getCity())
                .distinct().collect(Collectors.toList());
        uniqueCities.forEach(operatingCity -> resultList.add(orderList.stream()
                .filter(order -> order.getUser().getCity().equalsIgnoreCase(operatingCity)).collect(Collectors.toList())));

        return resultList;
    }

    public static boolean checkForLastName(List<Order> orderList, String lastName) {
        return orderList.stream().anyMatch(order -> order.getUser().getLastName().equalsIgnoreCase(lastName));
    }

    public static void removeOrdersByCurrencies(List<Order> orderList, Currency... currency) {
        Arrays.stream(currency).distinct().forEach(operatingCurrency ->
                orderList.removeIf(order -> order.getCurrency() == operatingCurrency));
    }

}