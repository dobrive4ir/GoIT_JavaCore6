package javacore.module5.domain;

import java.util.Date;

/**
 * Class room should contain fields
 * long id
 * int price
 * int persons
 * Date dateAvailableFrom
 * String hotelName
 * String cityName
 * Generate getters and setters and create constructor with all fields.
 * <p>
 * Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.
 */

public class Room {

    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public Room(int price, int persons, String city) {
        this.price = price;
        this.persons = persons;
        this.cityName = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = getPrice();
        result = prime * result + getPersons();
        result = prime * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nroom{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

}