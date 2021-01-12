
//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

package loops;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task8 {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        final char[] firstNumber = scanner.nextLine().toCharArray();
        System.out.println("Введите второе число:");
        final char[] secondNumber = scanner.nextLine().toCharArray();
        final Set<Character> digitsSet = new HashSet<>();

        for (char first : firstNumber) {
            for (char second : secondNumber) {
                if (digitsSet.size() != 10 && first == second) {
                    digitsSet.add(first);
                }
            }
        }
        if (digitsSet.size() > 0) {
            System.out.print("Цифрами входящими в запись как первого так и второго числа, являются:\n");
            for (char index : digitsSet) {
                System.out.print(Character.getNumericValue(index) + ", ");
            }
            System.out.println("\b\b.");
        } else {
            System.out.println("В данных числах нету повторяющихся цифр.");
        }
    }
}
