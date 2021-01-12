
//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

package string_StringBuilder;

public class Task5 {
    public static void main(final String[] args) {

        final String string = "aaa ааа"; // первые три - английские, остальные три русские

        int count = 0;
        for (int index = 0; index < string.length(); index++) {
            if (string.charAt(index) == 97 || string.charAt(index) == 1072) {
                count++;
            }
        }
        System.out.println("\n Среди символов заданной строки буква “а” встречается " + count + " раз.");
    }
}
