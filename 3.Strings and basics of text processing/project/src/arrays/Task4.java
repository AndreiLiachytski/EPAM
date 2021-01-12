
//4. В строке найти количество чисел.

package arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст :");
        final String s = scanner.nextLine();
        int result = 0;

        for (int index = 0; index < s.length(); index++) {
            char symbol = s.charAt(index);
            if (Character.isDigit(symbol)) {
                result++;
            }
        }
        System.out.println("\nКоличество цифр в данной строке равно " + result + ".");
    }
}

