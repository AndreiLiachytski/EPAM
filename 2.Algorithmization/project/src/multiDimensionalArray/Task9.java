
/*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

package multiDimensionalArray;

public class Task9 {
    public static void main(final String[] args) {

        final int lines = 7;
        final int columns = 5;
        final int[][] array = new int[lines][columns];

        System.out.println(" Исходная матрица :");
        for (int firstInitializationIndex = 0; firstInitializationIndex < lines; firstInitializationIndex++) {
            System.out.print(" {");
            for (int secondInitializationIndex = 0; secondInitializationIndex < columns; secondInitializationIndex++) {
                array[firstInitializationIndex][secondInitializationIndex] = ((int) (Math.random() * 90) + 10);
                System.out.print(" " + array[firstInitializationIndex][secondInitializationIndex] + ";");
            }
            System.out.print("\b }\n");
        }

        int maxResult = 0;
        int count = 0;

        for (int countingFirstIndex = 0; countingFirstIndex < columns; countingFirstIndex++) {
            int result = 0;
            for (int countingSecondIndex = 0; countingSecondIndex < lines; countingSecondIndex++) {
                result += array[countingSecondIndex][countingFirstIndex];
            }
            System.out.print("\nСумма элементов столбца под номером " + (countingFirstIndex + 1) + " равна " + result + ".");

            if (maxResult < result) {
                maxResult = result;
                count = countingFirstIndex;
            }
        }
        System.out.println("\n\nМаксимальная сумма элементов равная " + maxResult + ", содержится в столбце под номером " + (count + 1) + ".");
    }
}


