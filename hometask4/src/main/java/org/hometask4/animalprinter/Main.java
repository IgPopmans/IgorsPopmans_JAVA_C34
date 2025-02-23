package org.hometask4.animalprinter;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        // 2) Необходимо создать два перегруженных метода print. Один метод принимает обьект Cat, а второй объект Dog. Каждый из методов должен вернуть кличку животного.


        Cat cat = new Cat("Tim");
        Dog dog = new Dog("Jack");
        AnimalPrinter animalPrinter = new AnimalPrinter();

        System.out.println(animalPrinter.print(cat));
        System.out.println(animalPrinter.print(dog));



        // 1 Создать метод который принимает два целых числа. Данный метод должен вернуть максимальное число.
        System.out.println(findMaxNumber(2, 4));


    }

    public static int findMaxNumber(int firstNumber, int secondNumber) {
        return Math.max(secondNumber, firstNumber);
    }
}