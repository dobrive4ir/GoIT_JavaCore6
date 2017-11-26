package javacore.module7.task3;

import javacore.module4.Currency;
import javacore.module7.task1.Order;

import java.util.Iterator;
import java.util.TreeSet;

public final class OrderUtils3 {

    private OrderUtils3() {
    }

    public static boolean checkTheLastName(TreeSet<Order> orderSet, String lastName) {
        for (Order order : orderSet) {
            if (order.getUser().getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Order highestPriceOrder(TreeSet<Order> orderSet) {
        return orderSet.last();
    }

    public static void deleteCurrency(TreeSet<Order> orderSet, Currency currency) {
        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency() == currency) {
                iterator.remove();
            }
        }
    }

}