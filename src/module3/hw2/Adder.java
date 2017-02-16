package module3.hw2;

/**
 * Created by Dobryvechir on 15.02.2017.
 * Напишите класс Adder, который наследуется от класса Arithmetic. У класса Adder должен быть метод
 * check, который сравнивает 2 номера и возвращает true, если а>=b и false в других случаях.
 */

public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b) {
        return a >= b;
    }

}
