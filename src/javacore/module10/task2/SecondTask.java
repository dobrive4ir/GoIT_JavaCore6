package javacore.module10.task2;

public class SecondTask {

    public static void main(String[] args) throws NewException {

        try {
            throw new NewException("This is my Exception");
        } catch (NewException ne) {
            ne.printMessage();
        } finally {
            System.out.println("Finally block");
        }
    }

}