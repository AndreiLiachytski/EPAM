
/*3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

package singleDimensionalArray;

import java.util.Arrays;

public class Task3 {
    public static void main(final String[] args) {

        final int N = 10;
        final double[] array = new double[N];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = Math.floor(((Math.random() * 2 * N - N) * 100) / 100);
        }
        System.out.println("\n Исходный массив чисел :\n " + Arrays.toString(array));

        int lowerThanZeroCounter = 0;
        int biggerThanZeroCounter = 0;
        int equalZeroCounter = 0;

        for (double element : array) {
            if (element > 0) {
                biggerThanZeroCounter++;
            } else if (element < 0) {
                lowerThanZeroCounter++;
            } else {
                equalZeroCounter++;
            }
        }
        System.out.println("\n В данном массиве содержиться " + biggerThanZeroCounter + " положительных,\n "
                + lowerThanZeroCounter + " отрицательных и " + equalZeroCounter + " элементов равных 0. ");
    }
}