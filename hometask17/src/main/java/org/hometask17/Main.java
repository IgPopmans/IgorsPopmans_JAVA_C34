package org.hometask17;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {


        List<Integer> list = List.of(12, 344, 556, 4454, 5509, 123, 9, 9);
        Stream<Integer> integerStream = list.stream().filter(s -> s % 2 == 0);
        integerStream.forEach(integer -> System.out.println(integer));


        Stream<Integer> distinct = list.stream().distinct();
        distinct.forEach(integer -> System.out.println(integer));
        int sum = list.stream().mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);


        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        System.out.println(max);

        Optional<Integer> first = list.stream().filter(integer -> integer > 10)
                .findFirst();
        first.ifPresent(integer -> System.out.println(integer));


        boolean allDivisible = list.stream()
                .allMatch(i -> i % 10 == 0);

        System.out.println("divisible by 10" + " " + allDivisible);


        List<String> stringList = List.of("Black","White","Green","Red","Yellow");
        List<Integer> integers = stringList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(integers);


        List<String> strings = stringList.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(strings);


        List<String> collectedListWithoutA = stringList.stream()
                .filter(s -> !s.equals("a"))
                .collect(Collectors.toList());
        System.out.println(collectedListWithoutA);
    }
}