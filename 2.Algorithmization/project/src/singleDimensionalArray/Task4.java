
//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

package singleDimensionalArray;

import java.util.Arrays;

public class Task4 {
    public static void main(final String[] args) {

        final int n = 10;
        final double[] array = new double[n];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = Math.floor((Math.random() * 2 * n - n) * 100) / 100;
        }
        System.out.println("\n Исходный массив чисел :\n " + Arrays.toString(array));

        int indexMin = 0;
        int indexMax = 0;
        double cellMin = 0;
        double cellMax = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] < cellMin) {
                cellMin = array[index];
                indexMin = index;
            } else if (array[index] > cellMax) {
                cellMax = array[index];
                indexMax = index;
            }
        }
        array[indexMax] = cellMin;
        array[indexMin] = cellMax;
        System.out.println("\n Массив после замены элементов :\n " + Arrays.toString(array));
    }
}