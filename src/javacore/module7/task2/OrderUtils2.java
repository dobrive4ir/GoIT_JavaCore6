package javacore.module7.task2;

import javacore.module7.task1.Order;

import java.util.Comparator;
import java.util.List;

public final class OrderUtils2 {

    private OrderUtils2() {
    }

    public static void inversePriceSort(List<Order> orderList) {
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return ((Integer)o2.getPrice()).compareTo(o1.getPrice());
            }
        });
    }

    public static void priceCitySort(List<Order> orderList) {
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = ((Integer)o1.getPrice()).compareTo(o2.getPrice());
                if (result != 0) {
                    return result;
                }
                return o1.getUser().getCity().compareToIgnoreCase(o2.getUser().getCity());
            }
        });
    }

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
