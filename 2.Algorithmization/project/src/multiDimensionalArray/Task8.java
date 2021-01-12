
/*8. В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит пользователь
с клавиатуры.*/

package multiDimensionalArray;

import java.util.Scanner;

public class Task8 {
    public static void main(final String[] args) {

        final int lines = 10;
        final int columns = 10;
        final int[][] array = new int[lines][columns];

        System.out.println("\n Исходная матрица :");
        int count = 100;
        for (int firstInitializationIndex = 0; firstInitializationIndex < lines; firstInitializationIndex++) {
            System.out.print(" {");
            for (int secondInitializationIndex = 0; secondInitializationIndex < columns; secondInitializationIndex++) {
                array[firstInitializationIndex][secondInitializationIndex] = count;
                count++;
                System.out.print(" " + array[firstInitializationIndex][secondInitializationIndex] + ";");
            }
            System.out.print("\b }\n");
        }
        final Scanner scan = new Scanner(System.in);
        System.out.println("\n Введите номер первого столбца в диапазоне от 1 до " + columns + ".");
        final int columnNumberOne = (scan.nextInt() - 1);
        System.out.println(" Введите номер второго столбца в диапазоне от 1 до " + columns + ".");
        final int columnNumberTwo = (scan.nextInt() - 1);

        for (int replacementIndex = 0; replacementIndex < lines; replacementIndex++) {
            int cell = array[replacementIndex][columnNumberOne];
            array[replacementIndex][columnNumberOne] = array[replacementIndex][columnNumberTwo];
            array[replacementIndex][columnNumberTwo] = cell;
        }
        System.out.println("\n Матрица после замены столбцов :");
        for (int printingFirstIndex = 0; printingFirstIndex < lines; printingFirstIndex++) {
            System.out.print(" {");
            for (int printingSecondIndex = 0; printingSecondIndex < columns; printingSecondIndex++) {
                System.out.print(" " + array[printingFirstIndex][printingSecondIndex] + ";");
            }
            System.out.print("\b }\n");
        }
    }
}