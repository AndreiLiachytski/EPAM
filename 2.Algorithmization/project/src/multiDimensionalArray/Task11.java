
/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

package multiDimensionalArray;

public class Task11 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 20;
        final int[][] array = new int[lines][columns];

        System.out.println("\n Исходная матрица :");
        for (int firstInitializationIndex = 0; firstInitializationIndex < lines; firstInitializationIndex++) {
            System.out.print(" {");
            for (int secondInitializationIndex = 0; secondInitializationIndex < columns; secondInitializationIndex++) {
                array[firstInitializationIndex][secondInitializationIndex] = (int) (Math.random() * 15);
                System.out.print(" " + array[firstInitializationIndex][secondInitializationIndex] + ";");
            }
            System.out.print("\b }\n");
        }

        int maxCount = 0;
        for (int firstCountingIndex = 0; firstCountingIndex < lines; firstCountingIndex++) {
            int count = 0;
            for (int secondCountingIndex = 0; secondCountingIndex < columns; secondCountingIndex++) {
                if (array[firstCountingIndex][secondCountingIndex] == 5) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println("\n В строке номер " + (firstCountingIndex + 1) + " число 5 встречается " + count + " раз.");
            } else {
                maxCount++;
            }
        }
        if (maxCount == lines) {
            System.out.println("\n Нету строк в которых число 5 встречалось бы три и более раз.");
        }
    }
}

