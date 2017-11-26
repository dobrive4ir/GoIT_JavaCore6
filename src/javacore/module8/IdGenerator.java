package javacore.module8;

public final class IdGenerator {

    private static long uniqueId = 0;

    private IdGenerator() {
    }

    public static long generateId () {
        return ++uniqueId;
    }

}