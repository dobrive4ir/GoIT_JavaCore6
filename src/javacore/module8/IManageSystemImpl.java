package javacore.module8;

import java.util.*;

/**
 * Class implements IManageSystem interface and contains methods for working with Food databases
 */

public class IManageSystemImpl implements IManageSystem<Food> {

    private final Map<Food, Double> database = new HashMap<>();

    public Map<Food, Double> getDatabase() {
        return database;
    }

    /**
     * Save Food product to the database.
     *
     * @param obj product, that is saving to the database
     * @param price price of the saving product
     * @return Food product, that was saved to the database
     */
    @Override
    public Food save(Food obj, Double price) {
        this.database.put(obj, price);
        return obj;
    }

    /**
     * Update Food product in the database.
     *
     * @param obj product, that is updating
     * @return Food product, that was updated
     */
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

    /**
     * Remove Food product from the database.
     *
     * @param obj product, that is removing from the database
     */
    @Override
    public void delete(Food obj) {
        this.database.remove(obj);
    }

    /**
     * Remove Food product with the specified unique identifier from the database.
     *
     * @param id unique identifier of the product, that is removing from the database
     */
    @Override
    public void deleteById(long id) {
        Food element = get(id);
        this.database.remove(element);
    }

    /**
     * Returns Food product with the specified unique identifier.
     *
     * @param id unique identifier of the product, that is searching
     * @return Food product with the specified identifier
     */
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

    /**
     * Returns price of the specified Food product.
     *
     * @param obj specified product
     * @return Double price of the specified product
     */
    @Override
    public Double getPrice(Food obj) {
        return this.database.get(obj);
    }

    /**
     * Returns set with all Food products in the database.
     *
     * @return Set<Food> set with all products in database
     */
    @Override
    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    /**
     * Returns list with the price of each Food product in the database.
     *
     * @return List<Double> list with prices of each product in the database
     */
    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(this.database.values());
    }

}