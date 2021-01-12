
/*1.  Даны два угла треугольника (в градусах).
      Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. */

package branching;

import java.util.Scanner;

public class Task1 {
    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);

        System.out.println("Введите первый угол:");
        final double firstAngle = scan.nextDouble();

        System.out.println("Введите второй угол:");
        final double secondAngle = scan.nextDouble();

        final double thirdAngle = 180 - firstAngle - secondAngle;

        if (thirdAngle > 0 && thirdAngle != 90) {
            System.out.println("Такой треугольник существует, он не является прямоугольным. Третий угол равен " + thirdAngle + " градусов");
        } else if (thirdAngle == 90) {
            System.out.println("Такой треугольник существует, он является прямоугольным");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
