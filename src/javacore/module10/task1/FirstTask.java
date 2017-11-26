package javacore.module10.task1;

public class FirstTask {

    public static void main(String[] args) throws Exception {

        try {
            throw new Exception("String argument");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The finally block was called");
        }

    }

}