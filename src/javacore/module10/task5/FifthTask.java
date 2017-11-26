package javacore.module10.task5;

public class FifthTask {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        try {
            testClass.theMethod(null, "mnogo", "cast");
        } catch (DobryException1 | DobryException2 | DobryException3 dobEx) {
            dobEx.printStackTrace();
        }
    }

}