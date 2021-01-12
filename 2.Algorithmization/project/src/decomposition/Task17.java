
/*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

package decomposition;

public class Task17 {
    public static void main(final String[] args) {

        int number = 10;
        int count = 0;

        while (number != 0) {
            number -= getDigitsSum(number);
            count++;
        }
        System.out.println("\n Из заданного числа нужно произвести " + count + " вычитаний суммы его цифр, чтобы получился нуль.");
    }

    private static int getDigitsSum(final int number) {
        int sum = 0;

        final char[] array = String.valueOf(number).toCharArray();
        for (final char index : array) {
            sum += Character.getNumericValue(index);
        }
        return sum;
    }
}
