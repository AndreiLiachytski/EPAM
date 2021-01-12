
/*10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

package singleDimensionalArray;

import java.util.Arrays;

public class Task10 {
    public static void main(final String[] args) {

        final int n = 10;
        final int[] array = new int[n];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = (int) (Math.random() * n) + 1;
        }
        System.out.println("\n Исходный массив :\n " + Arrays.toString(array));

        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (index % 2 == 0) {
                array[index / 2] = array[index];
                count++;
            }
        }
        for (; count < array.length; count++) {
            array[count] = 0;
        }
        System.out.println("\n Массив после преобразования :\n " + Arrays.toString(array));
    }
}

