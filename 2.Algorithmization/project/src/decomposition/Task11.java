
//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package decomposition;

public class Task11 {

    /**
     * return true if number1 longer than number2
     */
     static boolean getLongerNumber(final int number1, final int number2) {
        return String.valueOf(number1).length() > String.valueOf(number2).length();
    }
}
