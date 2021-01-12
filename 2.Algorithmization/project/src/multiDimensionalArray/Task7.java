
/*  7.Сформировать квадратную матрицу порядка N по правилу:
    A[I,J]= sin((I^2 - J^2) / N);
    и подсчитать количество положительных элементов в ней. */

package multiDimensionalArray;

import java.util.Arrays;

public class Task7 {
    public static void main(final String[] args) {

        final int N = 5;
        final double[][] array = new double[N][N];

        for (int firstInitializationIndex = 0; firstInitializationIndex < N; firstInitializationIndex++) {
            for (int secondInitializationIndex = 0; secondInitializationIndex < N; secondInitializationIndex++) {
                double result = (Math.sin((Math.pow(firstInitializationIndex, 2) - Math.pow(secondInitializationIndex, 2)) / N));
                array[firstInitializationIndex][secondInitializationIndex] = Math.floor(result * 100) / 100;
            }
        }
        int count = 0;
        for (int countingFirstIndex = 0; countingFirstIndex < N; countingFirstIndex++) {
            for (int countingSecondIndex = 0; countingSecondIndex < N; countingSecondIndex++) {
                if (array[countingFirstIndex][countingSecondIndex] > 0) {
                    count++;
                }
            }
        }
        System.out.println("\n Исходная матрица : \n " + Arrays.deepToString(array));
        System.out.println("\n Количество положительных элементов в матрице равно " + count + ".");
    }
}

