
/*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   ((sin x +cos y)/(cos x - sin y)) ∗ tg xy .*/

package lineProgramms;

public class Task3 {
    public static void main(final String[] args) {

        final double angleX = 56.8;
        final double angleY = 34.5;
        final double result = ((Math.sin(angleX) + Math.cos(angleY)) / (Math.cos(angleX) - Math.sin(angleY)))
                * Math.tan(angleX * angleY);

        System.out.println("\n Значение выражения ((sin x + cos y) / (cos x - sin y)) ∗ tg xy  равняется: " + result + ".");
    }
}





