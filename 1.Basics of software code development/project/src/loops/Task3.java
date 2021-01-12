
//3. Найти сумму квадратов первых ста чисел.

package loops;

public class Task3 {
    public static void main(final String[] args) {

        long result = 0;

        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("\n Сумма квадратов первых ста чисел равна: " + result + ".");
    }
}
