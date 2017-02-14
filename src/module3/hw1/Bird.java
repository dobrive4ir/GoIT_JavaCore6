package module3.hw1;

/**
 * Created by Dobryvechir on 13.02.2017.
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