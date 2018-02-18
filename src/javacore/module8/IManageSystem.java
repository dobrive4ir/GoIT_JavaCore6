package javacore.module8;

import java.util.List;
import java.util.Set;

/**
 * Universal interface, that contains methods for working with a different products databases
 * @param <T>
 */

public interface IManageSystem<T> {

    /**
     * Save product to the database.
     *
     * @param obj product, that is saving to the database
     * @param price price of the saving product
     * @return T product, that was saved to the database
     */
    T save(T obj, Double price);

    /**
     * Update product in the database.
     *
     * @param obj product, that is updating
     * @return T product, that was updated
     */
    T save(T obj);

    /**
     * Remove product from the database.
     *
     * @param obj product, that is removing from the database
     */
    void delete(T obj);

    /**
     * Remove product with the specified unique identifier from the database.
     *
     * @param id unique identifier of the product, that is removing from the database
     */
    void deleteById(long id);

    /**
     * Returns product with the specified unique identifier.
     *
     * @param id unique identifier of the product, that is searching
     * @return T product with the specified identifier
     */
    T get(long id);

    /**
     * Returns price of the specified product.
     *
     * @param obj specified product
     * @return Double price of the specified product
     */
    Double getPrice(T obj);

    /**
     * Returns set with all products in the database.
     *
     * @return Set<T> set with all products in database
     */
    Set<T> getProducts();

    /**
     * Returns list with the price of each product in the database.
     *
     * @return List<Double> list with prices of each product in the database
     */
    List<Double> getPrices();

}