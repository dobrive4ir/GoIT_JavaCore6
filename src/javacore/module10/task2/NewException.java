package javacore.module10.task2;

public class NewException extends Exception {
    private final String strVar;

    public NewException(String str) {
        super(str);
        strVar = str;
    }

    public void printMessage() {
        System.out.println(strVar);
    }

}