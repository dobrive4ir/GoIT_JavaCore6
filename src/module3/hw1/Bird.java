package module3.hw1;

/**
 * Created by Dobryvechir on 13.02.2017.
 * Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 */

public class Bird {

    public void sing(String... song) {
        if (song ==  null) {
            System.out.println("Incorrect data!");
        } else {
            for (String phrase : song) {
                if (phrase != null) {
                    System.out.println(phrase);
                }
            }
        }
    }

}