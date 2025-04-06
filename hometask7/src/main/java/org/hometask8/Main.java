package org.hometask8;

import java.util.Arrays;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        //1) Вывести длину строки

        String someString = "Dependency";
        System.out.println(someString.length());

        // 2) Разбить строку по любому разделителю и вывести количество элементов

        String text = "black,green,yellow,blue";
        String[] words = text.split(",");
        System.out.println("Quantity of elements: " + words.length);

        // 3) получить подстроку с определенной позиции до конца

        String string = "Some new String";
        int startIndex = 8;
        String substring = string.substring(startIndex);
        System.out.println("Substring: " + substring);

        //  4) сделать строку которая будет зеркальна текущей

        String word = "Java learning";
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("reversed String: " + reversed);

        //         Создать произвольный шаблон
        //        Сделать строку используя данный шаблон (String.format), вставим некоторые значения

        String template = "User:%s \nAge: %d years \nCity: %s";
        String result = String.format(template,"John",30,"Paris");
        System.out.println(result);


    }
}
