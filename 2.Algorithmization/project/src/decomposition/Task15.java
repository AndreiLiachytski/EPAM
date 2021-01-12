
/*  15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 6789). Для решения задачи использовать декомпозицию. */

package decomposition;

public class Task15 {
    public static void main(final String[] args) {

        final int n = 3;

        System.out.print("\nЧисла удовлетворяющие условию задачи при n = " + n + " : \n{ ");

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (checkDigitsToPlusOne(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\b\b }");
    }

    private static boolean checkDigitsToPlusOne(final int number) {
        final char[] array = String.valueOf(number).toCharArray();
        boolean condition = true;

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] + 1 != array[index + 1]) {
                condition = false;
                break;
            }
        }
        return condition;
    }
}


