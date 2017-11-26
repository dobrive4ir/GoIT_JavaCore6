package javacore.module8;

import java.util.*;

public class IManageSystemImpl implements IManageSystem<Food> {

    private final Map<Food, Double> database = new HashMap<>();

    public Map<Food, Double> getDatabase() {
        return database;
    }

    @Override
    public Food save(Food obj, Double price) {
        this.database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        Food element = get(obj.getId());
        if (element != null) {
            element.setName(obj.getName());
            element.setCountry(obj.getCountry());
            element.setExpiration(obj.getExpiration());
        }
        return element;
    }

    @Override
    public void delete(Food obj) {
        this.database.remove(obj);
    }

    @Override
    public void deleteById(long id) {
        Food element = get(id);
        this.database.remove(element);
    }

    @Override
    public Food get(long id) {
        Set<Food> foodSet = this.database.keySet();
        for (Food element : foodSet) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return this.database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(this.database.values());
    }

}