
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

package arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(final String[] args) {

        final String[] array = {"camelCase", "someWord", "helloWorld", "newYork", "goodMorning"};

        for (int indexOfArray = 0; indexOfArray < array.length; indexOfArray++) {
            String buffer = array[indexOfArray];
            for (int indexOfBuffer = 0; indexOfBuffer < buffer.length(); indexOfBuffer++) {
                char symbol = buffer.charAt(indexOfBuffer);
                if (Character.isUpperCase(symbol)) {
                    String newBuffer = buffer.substring(0, indexOfBuffer) + '_' +
                            Character.toLowerCase(symbol) + buffer.substring(indexOfBuffer + 1);
                    array[indexOfArray] = newBuffer;
                }
            }
        }
        System.out.println("\n Массив после преобразования :\n " + Arrays.toString(array));
    }
}

