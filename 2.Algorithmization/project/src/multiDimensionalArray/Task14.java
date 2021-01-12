
/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

package multiDimensionalArray;

public class Task14 {
    public static void main(final String[] args) {

        final int m = 5;
        final int n = 5;
        final int[][] array = new int[m][n];

        System.out.println("\n");
        for (int firstInitializationIndex = 0; firstInitializationIndex < m; firstInitializationIndex++) {
            System.out.print(" { ");
            for (int secondInitializationIndex = 0; secondInitializationIndex < n; secondInitializationIndex++) {
                if (firstInitializationIndex <= secondInitializationIndex) {
                    array[firstInitializationIndex][secondInitializationIndex] = 1;
                }

                if (firstInitializationIndex > secondInitializationIndex) {
                    array[firstInitializationIndex][secondInitializationIndex] = 0;
                }
                System.out.print(" " + array[firstInitializationIndex][secondInitializationIndex] + " ");
            }
            System.out.print(" }\n");
        }
    }
}

