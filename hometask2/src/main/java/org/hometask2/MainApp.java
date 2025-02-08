package org.hometask2;

import java.util.Scanner;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {

        //Task1-------------------------------------


        long num = 100200000;
        int count = 0;

        for (; num % 10 == 0; num /= 10, count++) ;

        System.out.println(count);

        System.out.println("---------------------------");

        //Task2-------------------------------------

        int n = 5;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Interval of numbers " + n + " = " + result);
        System.out.println("---------------------------");

        //Task3------------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;

        System.out.println("The arithmetic mean: " + average);

        scanner.close();
    }
}