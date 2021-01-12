
//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

package string_StringBuilder;

public class Task1 {
    public static void main(final String[] args) {

        final String string = "     www '_-.    leningrad,:; ru ";
        int count = 0;
        int result = 0;

        for (int index = 0; index < string.length(); index++) {
            if (Character.isWhitespace(string.charAt(index))) {
                count++;
            } else if (result < count) {
                result = count;
                count = 0;
            } else if (!Character.isWhitespace(string.charAt(index))) {
                count = 0;
            }
        }
        System.out.println("\n Наибольшее количество подряд идущих пробелов в тексте равно " + result + ".");
    }
}
