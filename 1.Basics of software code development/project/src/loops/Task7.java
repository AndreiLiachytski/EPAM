
/*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 m и n вводятся с клавиатуры.*/

package loops;

import java.util.Scanner;

public class Task7 {
    public static void main(final String[] args) {

        int firstNumber;
        int secondNumber;
        final Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Введите первое число m:");
            firstNumber = scan.nextInt();
            System.out.println("Введите второе число n:");
            secondNumber = scan.nextInt();
        } while (firstNumber < 0 || secondNumber < firstNumber);

        for (; firstNumber <= secondNumber; firstNumber++) {

            final StringBuilder result = new StringBuilder();
            boolean condition = true;

            for (int divisor = 2; divisor <= secondNumber; divisor++) {
                if ((firstNumber % divisor == 0)
                        && (divisor != firstNumber)
                        && condition) {
                    result.append("Для натурального числа ").append(firstNumber)
                            .append(" делителем является ").append(divisor);
                    condition = false;
                } else if ((firstNumber % divisor == 0) && (divisor != firstNumber)) {
                    result.append(",").append(divisor);
                }
            }
            if (result.length() > 0) {
                System.out.println(result.append("."));
            }
        }
    }
}