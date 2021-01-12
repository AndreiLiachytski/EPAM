
/*5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
              {   1;   1; ...... 1; 1; }
              {   2;   2; ...... 2; 0; }
              {   3;   3; ...... 0; 0; }
              {   .    .  .....  .  .  }
              {  n-1; n-1;...... 0; 0; }
              {   n;   0; ... 0; 0; 0; }     */

package multiDimensionalArray;

public class Task5 {
    public static void main(final String[] args) {

        final int n = 8;
        final int[][] array = new int[n][n];
        int count = n;

        for (int firstIndex = 0; firstIndex < n; firstIndex++) {
            System.out.print("\n{");
            for (int secondIndex = 0; secondIndex < n; secondIndex++) {
                if (secondIndex < count) {
                    array[firstIndex][secondIndex] = firstIndex + 1;
                } else {
                    array[firstIndex][secondIndex] = 0;
                }
                System.out.print(" " + array[firstIndex][secondIndex] + ",");
            }
            count--;
            System.out.print("\b }");
        }
    }
}


