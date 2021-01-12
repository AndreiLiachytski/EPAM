
//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package multiDimensionalArray;

import java.util.Arrays;

public class Task15 {
    public static void main(final String[] args) {

        final int lines = 5;
        final int columns = 5;
        final int[][] array = new int[lines][columns];

        for (int firstInitializationIndex = 0; firstInitializationIndex < lines; firstInitializationIndex++) {
            for (int secondInitializationIndex = 0; secondInitializationIndex < columns; secondInitializationIndex++) {
                array[firstInitializationIndex][secondInitializationIndex] = (int) (Math.random() * 10) + 1;
            }
        }
        System.out.println("\n Исходная матрица :\n " + Arrays.deepToString(array));

        int maxValue = 0;
        for (int firstSearchIndex = 0; firstSearchIndex < lines; firstSearchIndex++) {
            for (int secondSearchIndex = 0; secondSearchIndex < columns; secondSearchIndex++) {
                if (array[firstSearchIndex][secondSearchIndex] > maxValue) {
                    maxValue = array[firstSearchIndex][secondSearchIndex];
                }
            }
        }
        System.out.println("\n Максимальный элемент матрицы равен " + maxValue);

        for (int firstReplacementIndex = 0; firstReplacementIndex < lines; firstReplacementIndex++) {
            for (int secondReplacementIndex = 0; secondReplacementIndex < columns; secondReplacementIndex++) {
                if (array[firstReplacementIndex][secondReplacementIndex] % 2 != 0) {
                    array[firstReplacementIndex][secondReplacementIndex] = maxValue;
                }
            }
        }
        System.out.println("\n Матрица после замены элементов :\n " + Arrays.deepToString(array));
    }
}

