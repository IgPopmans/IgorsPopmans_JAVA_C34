package org.hometask15.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

//  2) Есть массив слов. Необходимо создать map где ключ - это слово из массива, а значение - это его длинна.

        String[] strings = {"one", "two", "three", "four", "five"};

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (String string : strings) {
            stringIntegerMap.put(string, string.length());
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + stringIntegerEntry.getValue());
        }
    }
}
