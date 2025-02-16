package org.hometask3;

import java.util.Arrays;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {

        //1) Дан одноместный массив целых чисел. Необходимо получить второй, который будут зеркальной копией первого (элементы наоборот - с последнего до первого)

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(reversedArr));

        //2) Дан массив целых чисел. Необходимо удалить элемент, расположенный по середине.
        //
        //Самостоятельно

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        int midIndex = arr.length / 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < midIndex; i++) {
            newArr[i] = arr[i];
        }
        for (int i = midIndex; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        System.out.println(Arrays.toString(newArr));
    }
}