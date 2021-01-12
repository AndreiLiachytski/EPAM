
/*4.Сортировка обменами. Дана последовательность чисел a1 >= a2 >= ... an. Требуется переставить числа в порядке
возрастания. Для этого сравниваются два соседних числа a[i] и a[i+1]. Если a[i] > a[i+1], то делается перестановка.
    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

package sorting;

import java.util.Arrays;

public class Task4 {
    public static void main(final String[] args) {

        final int lastIndexOfSequence = 10;
        final int[] array = getSomeArray(lastIndexOfSequence);

        System.out.println("\nПервоначальная последовательность : \n" + Arrays.toString(array));

        int countOfReplacement = 0;
        for (int firstSortingIndex = array.length - 1; firstSortingIndex >= 0; firstSortingIndex--) {
            for (int secondSortingIndex = lastIndexOfSequence - 1; secondSortingIndex > 0; secondSortingIndex--) {
                if (array[secondSortingIndex - 1] > array[secondSortingIndex]) {
                    int cell = array[secondSortingIndex];
                    array[secondSortingIndex] = array[secondSortingIndex - 1];
                    array[secondSortingIndex - 1] = cell;
                    countOfReplacement++;
                }
            }
        }
        System.out.println("\nПоследовательность после сортировки :\n" + Arrays.toString(array));
        System.out.println("\nКоличество перестановок равно : " + countOfReplacement + ".");
    }


    private static int[] getSomeArray(final int arraySize) {
        final int[] array = new int[arraySize];
        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = (int) (Math.random() * 100);
        }
        return array;
    }
}
