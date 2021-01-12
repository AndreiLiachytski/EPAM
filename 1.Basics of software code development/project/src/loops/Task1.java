
/*1.   Напишите программу, где пользователь вводит любое целое положительное число.
       А программа суммирует все числа от 1 ДО введенного пользователем числа.*/

package loops;

import java.util.Scanner;

public class Task1 {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("\n Введите любое целое положительное число :");
        final int a = scanner.nextInt();

        int result = 0;
        for (int index = 0; index < a; index++) {
            result += index;
        }
        System.out.println("\n Сумма всех чисел от 1 ДО введенного Вами числа равна : " + result + ".");
    }
}
