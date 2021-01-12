
//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package singleDimensionalArray;

import java.util.Arrays;

public class Task1 {
    public static void main(final String[] args) {

        final int K = 3;
        final int N = 10;
        final int[] A = new int[N];

        for (int initializationIndex = 0; initializationIndex < A.length; initializationIndex++) {
            A[initializationIndex] = (int) (Math.random() * N);
        }

        int result = 0;
        for (int element : A) {
            if (element % K == 0) {
                result += element;
            }
        }
        System.out.println("\n Исходный массив чисел :\n " + Arrays.toString(A));
        System.out.println("\n Сумма элементов кратных " + K + " равняется " + result);
    }
}