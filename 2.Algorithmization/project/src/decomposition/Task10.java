
/*10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N. */

package decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите число :");
        getArray(scan.nextLine());
    }

    private static void getArray(final String N) {
        final char[] array = N.toCharArray();
        System.out.println("\nСформированный массив :\n" + Arrays.toString(array));
    }
}
