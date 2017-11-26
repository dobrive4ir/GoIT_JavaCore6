package javacore.module7.task1;

import javacore.module4.Currency;

public class Order implements Comparable<Order> {
    private final long id;
    private final int price;
    private final Currency currency;
    private final String itemName;
    private final String shopIdentificator;
    private final User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", currency=").append(currency);
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append(", shopIdentificator='").append(shopIdentificator).append('\'');
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (getId() != order.getId()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (getCurrency() != order.getCurrency()) return false;
        if (getItemName() != null ? !getItemName().equals(order.getItemName()) : order.getItemName() != null)
            return false;
        if (getShopIdentificator() != null ? !getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() != null)
            return false;
        return getUser() != null ? getUser().equals(order.getUser()) : order.getUser() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + (getCurrency() != null ? getCurrency().hashCode() : 0);
        result = 31 * result + (getItemName() != null ? getItemName().hashCode() : 0);
        result = 31 * result + (getShopIdentificator() != null ? getShopIdentificator().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Order o) {
        int result = ((Integer)this.getPrice()).compareTo(o.getPrice());
        if (result == 0) {
            result = ((Long)this.getId()).compareTo(o.getId());
            if (result == 0) {
                result = this.getItemName().compareToIgnoreCase(o.getItemName());
                if (result == 0) {
                    result = this.getShopIdentificator().compareToIgnoreCase(o.getShopIdentificator());
                }
            }
        }
        return result;
    }
}
