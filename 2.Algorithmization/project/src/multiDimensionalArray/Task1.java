
//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

package multiDimensionalArray;

public class Task1 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 10;
        final int[][] array = new int[lines][columns];

        System.out.println(" Исходный массив :");
        for (int i = 0; i < lines; i++) {
            System.out.print(" {");
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 200 + 200);
                System.out.print(" " + array[i][j] + ";");
            }
            System.out.print("\b }\n");
        }

        System.out.print("\n Нечетные столбцы, у которых первый элемент больше последнего. :");
        for (int i = 0; i < lines; i++) {
            System.out.print("\n {");
            for (int j = 0; j < columns; j++) {
                if (j % 2 == 0 && array[0][j] > array[lines - 1][j]) {
                    System.out.print(" " + array[i][j] + ";");
                }
            }
            System.out.print("\b }");
        }
    }
}