package org.hometask14.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class ListTask {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(13);
        integerList.add(10);
        integerList.add(11);
        integerList.add(14);
        integerList.add(17);

        List<Integer> evenIntegers = new ArrayList<>();

        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                evenIntegers.add(integer);
            }
        }
        System.out.println(evenIntegers);
    }
}
