package javacore.module7.task2;

import javacore.module7.task1.Order;

import java.util.Comparator;
import java.util.List;

/**
 * Class contains various methods for sorting Orders lists in accordance to the task 2.
 */

public final class OrderUtils2 {

    private OrderUtils2() {
    }

    /**
     * Sorts orders list by price decrease.
     *
     * @param orderList orders list, which will be sorted
     */
    public static void inversePriceSort(List<Order> orderList) {
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return ((Integer)o2.getPrice()).compareTo(o1.getPrice());
            }
        });
    }

    /**
     * Sorts orders list by price and users city.
     *
     * @param orderList orders list, which will be sorted
     */
    public static void priceCitySort(List<Order> orderList) {
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
                if (result != 0) {
                    return result;
                }
                return ((Integer)o1.getPrice()).compareTo(o2.getPrice());
            }
        });
    }

    /**
     * Sorts orders list by item name, shop identifier and users city.
     *
     * @param orderList orders list, which will be sorted
     */
    public static void itemNameShopIdentificatorCitySort(List<Order> orderList) {
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = o1.getItemName().compareToIgnoreCase(o2.getItemName());
                if (result != 0) {
                    return result;
                } else {
                    result = o1.getShopIdentificator().compareToIgnoreCase(o2.getShopIdentificator());
                    if (result != 0) {
                        return result;
                    }
                }
                return o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
            }
        });
    }
}
