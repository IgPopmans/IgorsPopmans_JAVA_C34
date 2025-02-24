package org.hometask4.animalprinter;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class AnimalPrinter {

    public String print(Cat cat) {
        return "Cat:" + cat.getName();
    }

    public String print(Dog dog) {
        return "Dog:" + dog.getName();
    }
}
