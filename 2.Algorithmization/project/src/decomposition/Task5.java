
/*5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

package decomposition;

import java.util.Arrays;

public class Task5 {
    public static void main(final String[] args) {

        final int N = 10;
        final int[] array = getSortedArray(N);

        System.out.println("\n Первоначальная последовательность :\n " + Arrays.toString(array));
        System.out.println("\n Второе по величине число массива :\n " + getSecondValueOfArray(array));
    }

    private static int[] getSortedArray(final int lastIndexOfArray) {
        final int[] array = new int[lastIndexOfArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * lastIndexOfArray);
        }
        Arrays.sort(array);
        return array;
    }

    private static int getSecondValueOfArray(final int[] array) {
        int result = 0;
        for (int index = array.length - 1; index > 0; index--) {
            if (array[index - 1] < array[index]) {
                result = array[index - 1];
                break;
            }
        }
        return result;
    }
}

