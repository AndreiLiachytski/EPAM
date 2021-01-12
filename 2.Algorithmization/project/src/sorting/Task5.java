
/*5. Сортировка вставками. Дана последовательность чисел  a1,a2,... ,an. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2,..., an - упорядоченная последовательность, т. е.
a1<=a2<=...<=an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность
была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание:
место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
Двоичный поиск оформить в виде отдельной функции.*/

package sorting;

import java.util.Arrays;

public class Task5 {
    public static void main(final String[] args) {

        final int n = 20;
        final int[] array = getSomeArray(n);

        System.out.println("\n Исходный массив :\n " + Arrays.toString(array));

        for (int sortingIndex = 0; sortingIndex < array.length - 1; sortingIndex++) {
            final int indexOfInsert = binarySearch(array, array[sortingIndex + 1], 0, sortingIndex);
            final int cell = array[sortingIndex + 1];

            for (int copyingIndex = sortingIndex; copyingIndex >= indexOfInsert; copyingIndex--) {
                array[copyingIndex + 1] = array[copyingIndex];
            }
            array[indexOfInsert] = cell;
        }
        System.out.println("\n Массив после сортировки :\n " + Arrays.toString(array));
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] < key) {
                low = middle + 1;
            } else if (array[middle] > key) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }

    private static int[] getSomeArray(final int arraySize) {
        final int[] array = new int[arraySize];
        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = (int) (Math.random() * 100);
        }
        return array;
    }
}
