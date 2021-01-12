
//3. В строке найти количество цифр.

package arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст :");
        final String s = scanner.nextLine();

        int count = 0;
        for (int index = 0; index < s.length(); index++) {
            final char symbol = s.charAt(index);
            if (Character.isDigit(symbol)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("\nКоличество цифр в данной строке равно " + count + ".");
        } else {
            System.out.println("\nВ данной строке не содержится цифр.");
        }
    }
}
