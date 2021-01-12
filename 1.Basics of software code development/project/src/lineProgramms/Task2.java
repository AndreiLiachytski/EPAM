
//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения).

package lineProgramms;

public class Task2 {
    public static void main(final String[] args) {

        final double a = 9.004;
        final double b = 3.98;
        final double c = -2.54;

        final double result = ((b + Math.sqrt(Math.abs((Math.pow(b, 2) + (4 * a * c))))) / (2 * a))
                - (Math.pow(a, 3) * c) + (Math.pow(b, -2));

        System.out.println("\n Значение выражения равно: " + result + ".");
    }
}