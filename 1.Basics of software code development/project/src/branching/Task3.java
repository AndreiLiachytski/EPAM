
//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

package branching;

public class Task3 {
    public static void main(final String[] args) {

        final double x1 = -5;
        final double y1 = 5;
        final double x2 = -8.46;
        final double y2 = 6;
        final double x3 = 44;
        final double y3 = 9;

 /*Предположим, что эти три точки образуют треугольник. Если его площадь равна 0, значит три точки лежат на одной прямой.
  Используем формулу вычисления площади треугольника через координаты вершин: S=1/2[(х1-х3)(у2-у3)-(х2-х3)(у1-у3)].  */

        final double areaOfTriangle = Math.abs(((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3))) / 2;

        if (areaOfTriangle != 0) {
            System.out.println("\n Точки А,В,С не лежат на одной прямой");
        } else {
            System.out.println("\n Точки А,В,С лежат на одной прямой");
        }
    }
}

