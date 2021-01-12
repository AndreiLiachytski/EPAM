
/*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

package decomposition;

public class Task16 {
    public static void main(final String[] args) {

        final int n = 1;
        int sum = 0;

        for (int number = (int) Math.pow(10, n - 1); number < (int) Math.pow(10, n); number++) {
            if (findingNumbersWithOddDigits(number)) {
                sum += number;
            }
        }
        System.out.println("\nСумма " + n + " - значных чисел, содержащих только нечетные цифры равняется " + sum +
                ".\nКоличество четных цифр в ней равно: " + countingEvenDigits(sum) + ".");
    }

    private static boolean findingNumbersWithOddDigits(final int number) {
        final char[] array = String.valueOf(number).toCharArray();
        boolean condition = true;

        for (final char digit : array) {
            if (Character.getNumericValue(digit) % 2 == 0) {
                condition = false;
                break;
            }
        }
        return condition;
    }

    private static int countingEvenDigits(final int number) {
        final char[] array = String.valueOf(number).toCharArray();
        int count = 0;

        for (final char digit : array) {
            if (Character.getNumericValue(digit) != 0 && Character.getNumericValue(digit) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}



