
/*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/

package decomposition;

public class Task13 {
    public static void main(final String[] args) {

        final int n = 40;
        final int[] simpleNumbers = new int[n];

        for (int number = n, initializationIndex = 0; number < n * 2; number++) {
            if (isSimple(number)) {
                simpleNumbers[initializationIndex] = number;
                initializationIndex++;
            }
        }
        System.out.print("\nВ заданном диапазоне значений n, найдены следующие \"близнецы\" :");
        for (int searchIndex = 0; searchIndex < simpleNumbers.length - 1; searchIndex++) {
            if (simpleNumbers[searchIndex] + 2 == simpleNumbers[searchIndex + 1]) {
                System.out.print("\n" + simpleNumbers[searchIndex] + " и " + simpleNumbers[searchIndex + 1] + ",");
            }
        }
        System.out.print("\b.\n");
    }

    private static boolean isSimple(final int a) {
        boolean bool = false;

        if (a == 2 || a == 3) {
            bool = true;
        } else {
            for (int divisor = 2; divisor <= ((int) Math.sqrt(a)); divisor++) {
                if (a % divisor != 0) {
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




