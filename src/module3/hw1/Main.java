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
        Bird bird = new Bird();
        String[] songPart1 = {"I am walking", "I am flying"};
        String songPart2 = "I am singing";
        bird.sing(songPart1);
        bird.sing(songPart2);
        bird.sing("I am Bird");
    }

}
