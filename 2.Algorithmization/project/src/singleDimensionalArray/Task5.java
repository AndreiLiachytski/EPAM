
//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package singleDimensionalArray;

import java.util.Arrays;

public class Task5 {
    public static void main(final String[] args) {

        final int n = 20;
        final int[] array = new int[n];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = (int) (Math.random() * n) + 1;
        }
        System.out.println("\n Исходный массив чисел :\n " + Arrays.toString(array));

        for (int index = 0; index < array.length; index++)
            if (array[index] <= index) {
                array[index] = 0;
            }
        System.out.println("\n Числа удовлетворяющие условию \"аi > i\" :\n " + Arrays.toString(array));
    }
}


