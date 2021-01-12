
/*3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.*/

package decomposition;

public class Task3 {
    public static void main(final String[] args) {

        final double sideOfHexagon = 2;
        final double squareOfHexagon = Math.floor((6 * getSquareOfTriangle(sideOfHexagon)) * 100) / 100;

        System.out.println("\nПлощадь правильного шестиугольника со стороной \"" + sideOfHexagon + "\", равняется : " + squareOfHexagon + ".");
    }

    private static double getSquareOfTriangle(final double sizeSideOfHexagon) {
        return (Math.sqrt(3) / 4) * Math.pow(sizeSideOfHexagon, 2);
    }
}
