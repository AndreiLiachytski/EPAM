
/*7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=..<=an и b1<=b2<=...<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.*/

package sorting;

import java.util.Arrays;

public class Task7 {
    public static void main(final String[] args) {

        final int[] nSequence = new int[15];
        final int[] mSequence = new int[10];

        for (int initializationIndex = 0; initializationIndex < nSequence.length; initializationIndex++) {
            nSequence[initializationIndex] = (int) (Math.random() * 1000) + 1;
        }
        Arrays.sort(nSequence);

        for (int initializationIndex = 0; initializationIndex < mSequence.length; initializationIndex++) {
            mSequence[initializationIndex] = (int) (Math.random() * 1000) + 1;
        }

        System.out.print("\n Последовательность a(n) :\n " + Arrays.toString(nSequence));
        System.out.println("\n Последовательность b(m) :\n " + Arrays.toString(mSequence));

        final int[] totalSequence = Arrays.copyOf(nSequence, nSequence.length + mSequence.length);

        for (int mSequenceItemIndex = 0; mSequenceItemIndex < mSequence.length; mSequenceItemIndex++) {
            final int insertIndex = binarySearch(totalSequence, mSequence[mSequenceItemIndex], 0, nSequence.length + mSequenceItemIndex);
            int indexOfZero = insertIndex;

            do {
                indexOfZero++;
            } while (totalSequence[indexOfZero] != 0);

            final int cell = mSequence[mSequenceItemIndex];
            for (; indexOfZero != insertIndex; indexOfZero--) {
                totalSequence[indexOfZero] = totalSequence[indexOfZero - 1];
            }
            totalSequence[insertIndex] = cell;

            System.out.println("\n Индекс места вставки :" + insertIndex + ", элемент для вставки :" + mSequence[mSequenceItemIndex] + ".");
            System.out.println(" Результат :\n " + Arrays.toString(totalSequence));
        }
    }

    private static int binarySearch(final int[] array, final int key, int low, int high) {
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] < key) {
                low = middle + 1;
            } else if (array[middle] > key) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }
}
