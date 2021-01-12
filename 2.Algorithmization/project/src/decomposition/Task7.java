
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package decomposition;

public class Task7 {
    public static void main(final String[] args) {

        final int lastNumber = 9;

        int sumFactorialOddNumbers = 0;
        for (int number = lastNumber; number >= 1; number--) {
            if (number % 2 != 0) {
                sumFactorialOddNumbers += getFactorial(number);
            }
        }
        System.out.println("\nСумма факториалов всех нечетных чисел от 1 до " + lastNumber + " равна " + sumFactorialOddNumbers + ". ");
    }

    static private int getFactorial(final int someNumber) {
        return someNumber <= 1 ? 1 : someNumber * getFactorial((someNumber - 1));
    }
}







