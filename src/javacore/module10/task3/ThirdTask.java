package javacore.module10.task3;

public class ThirdTask {

    public static void main(String[] args) {
        Object ref = null;

        try {
            System.out.println(ref.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
