
/* 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/

package sorting;

import java.util.Arrays;

public class Task3 {
    public static void main(final String[] args) {

        final int lastIndexOfSequence = 10;

        System.out.println("\n Первоначальная последовательность : \n " + Arrays.toString(getSomeArray(lastIndexOfSequence)));
        System.out.println("\n Последовательность после сортировки :\n " + Arrays.toString(getSortedArray(getSomeArray(lastIndexOfSequence))));
    }

    private static int[] getSortedArray(final int[] array) {
        for (int firstSortingIndex = 0; firstSortingIndex < array.length; firstSortingIndex++) {
            int maxElement = 0;
            int indexOfMaxElement = 0;
            for (int secondSortingIndex = firstSortingIndex; secondSortingIndex < array.length; secondSortingIndex++) {
                if (array[secondSortingIndex] >= maxElement) {
                    maxElement = array[secondSortingIndex];
                    indexOfMaxElement = secondSortingIndex;
                }
            }
            array[indexOfMaxElement] = array[firstSortingIndex];
            array[firstSortingIndex] = maxElement;
        }
        return array;
    }

    private static int[] getSomeArray(final int lastIndexOfSequence) {
        final int[] array = new int[lastIndexOfSequence];
        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = (int) (Math.random() * lastIndexOfSequence);
        }
        return array;
    }
}
