
//10. Найти положительные элементы главной диагонали квадратной матрицы.

package multiDimensionalArray;

public class Task10 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 10;
        final int[][] array = new int[lines][columns];
        final StringBuilder result = new StringBuilder("\n Положительные элементы главной диагонали :\n ");

        System.out.println("\n Исходная матрица :");
        for (int firstInitializationIndex = 0; firstInitializationIndex < lines; firstInitializationIndex++) {
            System.out.print(" {");
            for (int secondInitializationIndex = 0; secondInitializationIndex < columns; secondInitializationIndex++) {
                array[firstInitializationIndex][secondInitializationIndex] = (int) (Math.random() * 2 * lines - lines);

                if (array[firstInitializationIndex][secondInitializationIndex] >= 0) {
                    System.out.print(" " + array[firstInitializationIndex][secondInitializationIndex] + ";");
                } else {
                    System.out.print("" + array[firstInitializationIndex][secondInitializationIndex] + ";");
                }
            }
            System.out.print("\b }\n");
        }

        System.out.println("\n Главная диагональ матрицы :");
        System.out.print(" {");
        int columnsIndex = 0;
        for (int linesIndex = 0; linesIndex < lines; linesIndex++) {
            System.out.print(" " + array[linesIndex][columnsIndex] + ";");
            if (array[linesIndex][columnsIndex] > 0) {
                result.append(array[linesIndex][columnsIndex] + "; ");
            }
            columnsIndex++;
        }
        System.out.print("\b }\n");
        System.out.println(result);
    }
}

