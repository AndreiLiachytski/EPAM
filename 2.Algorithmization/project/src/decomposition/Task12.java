
/*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.*/

package decomposition;

import java.util.Arrays;

public class Task12 {

    private static final int K = 10;
    private static final int N = 1000;

    public static void main(final String[] args) {

        final int[] array = new int[N / K];

        for (int number = K, initializationIndex = 0; number < N; number++) {
            if (checkingTaskCondition(number)) {
                array[initializationIndex] = number;
                initializationIndex++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean checkingTaskCondition(final int number) {
        final char[] array = String.valueOf(number).toCharArray();
        int result = 0;
        for (final char index : array) {
            result += Character.getNumericValue(index);
        }
        return result == K && number < N;
    }
}



