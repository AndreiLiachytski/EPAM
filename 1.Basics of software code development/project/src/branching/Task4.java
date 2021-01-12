
/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
     Определить, пройдет ли кирпич через отверстие.*/

package branching;

public class Task4 {
    public static void main(final String[] args) {

        final int sideOfHoleA = 9;
        final int sideOfHoleB = 9;
        final int sideOfBrickX = 8;
        final int sideOfBrickY = 8;

        if (sideOfBrickX < sideOfHoleA && sideOfBrickY < sideOfHoleB) {
            System.out.println("\n Кирпич пролезет в отверстие");
        } else {
            System.out.println("\n Кирпич не пролезет в отверстие");
        }
    }
}
