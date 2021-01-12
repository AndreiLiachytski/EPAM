
//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

package multiDimensionalArray;

public class Task3 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 5;
        final int k = 1;
        final int p = 3;
        final int[][] array = new int[lines][columns];

        System.out.println(" Исходный массив :");
        for (int i = 0; i < lines; i++) {
            System.out.print(" {");
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 300 + 200);
                System.out.print(" " + array[i][j] + ";");
            }
            System.out.print("\b }\n");
        }

        System.out.print("\n Строка с индексом " + k + " :\n {");
        for (int i = 0; i < columns; i++) {
            System.out.print(" " + array[k][i] + ";");
        }
        System.out.print("\b }");

        System.out.print("\n Столбец с индексом " + p + " :\n {");
        for (int i = 0; i < lines; i++) {
            System.out.print(" " + array[i][p] + ";");
        }
        System.out.print("\b }");
    }
}