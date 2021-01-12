
/* 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

package singleDimensionalArray;

import java.util.Arrays;

public class Task2 {
    public static void main(final String[] args) {

        final int Z = 3;
        final int n = 10;
        int count = 0;
        final double[] array = new double[n];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = Math.floor((Math.random() * 2 * n - n) * 100) / 100;
        }
        System.out.println("\n Исходный массив чисел :\n " + Arrays.toString(array));

        for (int index = 0; index < array.length; index++) {
            if (array[index] > Z) {
                array[index] = Z;
                count++;
            }
        }
        System.out.println("\n Число Z по условию задачи :" + Z + ".");

        System.out.println("\n Массив после замен :\n " + Arrays.toString(array));
        System.out.println("\n Количество замен равно : " + count + ".");
    }
}
