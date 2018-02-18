package javacore.module8;

/**
 * Class contains method for generating a unique identifier.
 */

public final class IdGenerator {

    private static long uniqueId = 0;

    private IdGenerator() {
    }

    /**
     * Generate unique identifier.
     *
     * @return long unique identifier
     */
    public static long generateId () {
        return ++uniqueId;
    }

}