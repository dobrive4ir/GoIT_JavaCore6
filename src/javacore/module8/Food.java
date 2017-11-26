package javacore.module8;

public class Food {

    private final long id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public Food(long id, String name, Country country, int expiration) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "\nFood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }

}