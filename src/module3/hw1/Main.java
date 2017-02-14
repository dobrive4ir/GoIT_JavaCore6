package module3.hw1;

/**
 * Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 */

public class Main {

    public static void main(String[] args) {
        String birdSong = "I am walking" +"\nI am flying" + "\nI am singing" + "\nI am Bird";
        Bird bird = new Bird();
        bird.sing(birdSong);
    }

}
