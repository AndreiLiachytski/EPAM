
//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package multiDimensionalArray;

public class Task2 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 10;
        int[][] array = new int[lines][columns];

        System.out.println(" Исходный массив :");
        for (int i = 0; i < lines; i++) {
            System.out.print(" {");
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 200 + 100);
                System.out.print(" " + array[i][j] + ";");
            }
            System.out.print("\b }\n");
        }
        System.out.println("\n Главная диагональ исходного массива :");
        System.out.print(" {");
        int j = 0;
        for (int i = 0; i < lines; i++) {
            System.out.print(" " + array[i][j] + ";");
            j++;
        }
        System.out.print("\b }");
    }
}
