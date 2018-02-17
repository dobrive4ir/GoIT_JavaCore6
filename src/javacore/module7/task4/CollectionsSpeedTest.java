package javacore.module7.task4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class contains measuring of time execution for the next operations with ArrayList<> and LinkedList<>:
 * add;
 * set;
 * get;
 * remove.
 */

public final class CollectionsSpeedTest {

    private static ArrayList<String> smallStrArr = new ArrayList<>(1000);
    private static ArrayList<String> largeStrArr = new ArrayList<>(10000);
    private static ArrayList<Integer> smallIntArr = new ArrayList<>(1000);
    private static ArrayList<Integer> largeIntArr = new ArrayList<>(10000);
    private static LinkedList<String> smallStrLList = new LinkedList<>();
    private static LinkedList<String> largeStrLList = new LinkedList<>();
    private static LinkedList<Integer> smallIntLLists = new LinkedList<>();
    private static LinkedList<Integer> largeIntLList = new LinkedList<>();

    static {
        for (int i = 0; i < 10000; i++) {
            if (i < 1000) {
                smallStrArr.add("1");
                smallIntArr.add(1);
                smallStrLList.add("1");
                smallIntLLists.add(1);
            }
            largeStrArr.add("1");
            largeIntArr.add(1);
            largeStrLList.add("1");
            largeIntLList.add(1);
        }
    }

    private CollectionsSpeedTest() {
    }

    public static void main(String[] args) {

        long start;
        long end;

        System.out.println("1. Time, that was spent for adding the element to the head of:");
        System.out.println("1.1 ArrayList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrArr.add(0, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.2 ArrayList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntArr.add(0, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.3 ArrayList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrArr.add(0, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.4 ArrayList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntArr.add(0, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.5 LinkedList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrLList.addFirst("0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.6 LinkedList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntLLists.addFirst(0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.7 LinkedList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrLList.addFirst("0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("1.8 LinkedList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntLList.addFirst( 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("****************************************************************************************\n");

        System.out.println("2. Time, that was spent for replacing the element in:");
        System.out.println("2.1 ArrayList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrArr.set(smallStrArr.size() / 2, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.2 ArrayList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntArr.set(smallIntArr.size() / 2, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.3 ArrayList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrArr.set(largeStrArr.size() / 2, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.4 ArrayList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntArr.set(largeIntArr.size() / 2, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.5 LinkedList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrLList.set(smallStrLList.size() / 2, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.6 LinkedList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntLLists.set(smallIntLLists.size() / 2, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.7 LinkedList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrLList.set(largeStrLList.size() / 2, "0");
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("2.8 LinkedList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntLList.set(largeIntLList.size() / 2, 0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("****************************************************************************************\n");

        System.out.println("3. Time, that was spent for getting the element from:");
        System.out.println("3.1 ArrayList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrArr.get(smallStrArr.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.2 ArrayList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntArr.get(smallIntArr.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.3 ArrayList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrArr.get(largeStrArr.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.4 ArrayList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntArr.get(largeIntArr.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.5 LinkedList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrLList.get(smallStrLList.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.6 LinkedList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntLLists.get(smallIntLLists.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.7 LinkedList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrLList.get(largeStrLList.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("3.8 LinkedList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntLList.get(largeIntLList.size() / 2);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("****************************************************************************************\n");

        System.out.println("4. Time, that was spent for removing the element from the head of:");
        System.out.println("4.1 ArrayList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrArr.remove(0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.2 ArrayList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntArr.remove(0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.3 ArrayList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrArr.remove(0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.4 ArrayList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntArr.remove(0);
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.5 LinkedList, that consist of 1000 'String' elements:");
        start = System.nanoTime();
        smallStrLList.removeFirst();
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.6 LinkedList, that consist of 1000 'Integer' elements:");
        start = System.nanoTime();
        smallIntLLists.removeFirst();
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.7 LinkedList, that consist of 10000 'String' elements:");
        start = System.nanoTime();
        largeStrLList.removeFirst();
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("4.8 LinkedList, that consist of 10000 'Integer' elements:");
        start = System.nanoTime();
        largeIntLList.removeFirst();
        end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds");
        System.out.println("****************************************************************************************\n");

    }

}