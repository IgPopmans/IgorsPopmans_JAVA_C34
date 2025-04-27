package org.hometask16;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("4 is even: " + isEven.test(4));

        Consumer<String> toUpperCase = str -> System.out.println(str.toUpperCase());
        toUpperCase.accept("hello Java");

        Supplier<String> greetingSupplier = () -> "Hello from World!";
        System.out.println(greetingSupplier.get());

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'World': " + stringLength.apply("World"));

        Comparator<Worker> salaryComparator = Comparator.comparing(s -> s.getSalary());


        TreeSet<Worker> treeSet = new TreeSet<>(salaryComparator);
        treeSet.add(new Worker(100));
        treeSet.add(new Worker(250));
        treeSet.add(new Worker(400));
        treeSet.add(new Worker(5900));

        treeSet.stream().forEach(worker -> System.out.println(worker));
    }
}