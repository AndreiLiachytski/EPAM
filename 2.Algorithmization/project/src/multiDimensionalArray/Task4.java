
/*4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        {  1;  2;   3; ..... n; }
        {  n; n-1; n-2;......1; }
        {  1;  2;   3; ..... n; }
        {  n; n-1; n-2;......1; }
        {  .   .    .  ....  .  }
        {  n; n-1; n-2;......1; }   */

package multiDimensionalArray;

public class Task4 {
    public static void main(final String[] args) {

        final int n = 8;
        final int[][] array = new int[n][n];

        for (int firstIndex = 0; firstIndex < n; firstIndex++) {
            System.out.print("\n{");
            if (firstIndex % 2 == 0) {
                for (int secondIndex = 0; secondIndex < n; secondIndex++) {
                    array[firstIndex][secondIndex] = secondIndex + 1;
                    System.out.print(" " + array[firstIndex][secondIndex] + ";");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[firstIndex][j] = j + 1;
                    System.out.print(" " + array[firstIndex][j] + ";");
                }
            }
            System.out.print("\b }");
        }
    }
}

