
/*6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/

package singleDimensionalArray;

import java.util.Arrays;

public class Task6 {
    public static void main(final String[] args) {

        final int N = 10;
        final double[] array = new double[N];

        for (int initializationIndex = 0; initializationIndex < array.length; initializationIndex++) {
            array[initializationIndex] = Math.floor(((Math.random() * 2 * N - N) * 100) / 100);
        }
        System.out.println("\n Исходная последовательность :\n" + Arrays.toString(array));

        double result = 0;
        for (int index = 0; index < array.length; index++) {
            if (isSimple(index)) {
                result += array[index];
            }
        }
        System.out.println("\n Сумма чисел последовательности, порядковые номера которых являются простыми числами, равна : \n" + result);
    }

    private static boolean isSimple(final int number) {
        boolean bool = false;
        if (number == 2 || number == 3) {
            bool = true;
        } else {
            for (int divisor = 2; divisor <= ((int) Math.sqrt(number)); divisor++) {
                if (number % divisor != 0) {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }

}