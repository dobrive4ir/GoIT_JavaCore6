package javacore.module7.task3;

import javacore.module4.Currency;
import javacore.module7.task1.Order;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Class contains various methods for sorting Orders sets in accordance to the task 3.
 */

public final class OrderUtils3 {

    private OrderUtils3() {
    }

    /**
     * Sorts orders list by price decrease.
     *
     * @param orderSet orders set, where the search is performed
     * @param lastName last name of the user, which is required to be found
     * @return <tt>true</tt> if the last name was found, <tt>false</tt> - if the last name wasn't found
     */
    public static boolean checkTheLastName(TreeSet<Order> orderSet, String lastName) {
        for (Order order : orderSet) {
            if (order.getUser().getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns order with the highest price in the set.
     *
     * @param orderSet set of orders
     * @return Order order with the highest price
     */
    public static Order highestPriceOrder(TreeSet<Order> orderSet) {
        return orderSet.last();
    }

    /**
     * Remove orders with the specified currency from orders set.
     *
     * @param orderSet orders set, which will be edited
     * @param currency specified order currency
     */
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