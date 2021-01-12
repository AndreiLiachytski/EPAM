
/*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
*/

package sorting;

import java.util.Arrays;

public class Task6 {
    public static void main(final String[] args) {

        final int n = 10;
        final double[] array = new double[n];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = Math.floor((Math.random() * n) - n / 2);
        }

        System.out.println("Исходный массив :");
        System.out.println(Arrays.toString(array));

        for (int step = n / 2; step > 0; step /= 2) {
            for (int firstIndex = step; firstIndex < n; firstIndex++) {
                for (int secondIndex = firstIndex - step; secondIndex >= 0 && array[secondIndex] > array[secondIndex + step]; secondIndex -= step) {
                    double cell = array[secondIndex];
                    array[secondIndex] = array[secondIndex + step];
                    array[secondIndex + step] = cell;
                }
            }
        }
        System.out.println("Массив после сортировки :");
        System.out.println(Arrays.toString(array));
    }
}
