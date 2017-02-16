package module3.hw2;

/**
 * Created by Dobryvechir on 15.02.2017.
 * Напишите класс с названием Arithmetic с методом add, который принимает целые числа как параметры
 * и возвращает переменную типа integer, которая есть их суммой.
 */
public class Arithmetic {

    public int add(Integer a, Integer b) {
        if (a == null || b == null) {
            return Integer.MIN_VALUE;
        }
        return a + b;
    }

}
