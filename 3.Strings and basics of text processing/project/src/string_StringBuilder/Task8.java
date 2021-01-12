
/*8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/

package string_StringBuilder;

public class Task8 {
    public static void main(final String[] args) {

        final String string = "Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых\n" +
                "длинных слов может быть несколько, не обрабатывать.";
        int count = 0;
        int result = 0;
        StringBuilder word = new StringBuilder();
        StringBuilder longerWord = new StringBuilder();

        for (int index = 0; index < string.length(); index++) {
            if (Character.isLetter(string.charAt(index))) {
                count++;
                word.append(string.charAt(index));
            } else if (result < count) {
                result = count;
                count = 0;
                longerWord = word;
                word = new StringBuilder();
            } else if (!Character.isLetter(string.charAt(index))) {
                count = 0;
                word = new StringBuilder();
            }
        }
        System.out.println("\n Самым длинным словом в данной строке является : \"" + longerWord + "\".");
    }
}
