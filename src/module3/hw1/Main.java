package module3.hw1;

/**
 * Created by Пользователь on 14.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        String birdSong = "I am walking" +"\nI am flying" + "\nI am singing" + "\nI am Bird";
        Bird bird = new Bird();
        bird.sing(birdSong);
    }

}
