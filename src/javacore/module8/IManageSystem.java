package javacore.module8;

import java.util.List;
import java.util.Set;

public interface IManageSystem<T> {

    T save(T obj, Double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(long id);

    T get(long id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();

}