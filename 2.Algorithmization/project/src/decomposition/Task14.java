
/* 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.*/

package decomposition;

public class Task14 {
    public static void main(final String[] args) {

        final long k = 10000;

        System.out.println("\nЧислами Армстронга в диапазоне от 1 до " + k + " являются :\n");
        for (int number = 1; number < k; number++) {
            if (checkingArmstrongNumberCondition(number)) {
                System.out.print(number + ", ");
            }
        }
        System.out.print("\b\b.\n");
    }

    private static boolean checkingArmstrongNumberCondition(final int number) {
        final char[] array = String.valueOf(number).toCharArray();
        long result = 0;

        for (final char index : array) {
            final long value = (long) (Math.pow(Character.getNumericValue(index), array.length));
            result += value;
        }
        return result == number;
    }
}
