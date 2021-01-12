
//6.Из заданной строки получить новую, повторив каждый символ дважды.

package string_StringBuilder;

public class Task6 {
    public static void main(final String[] args) {

        final String string = "www.leningradSPB.ru";
        final StringBuilder resultingString = new StringBuilder();

        for (int index = 0; index < string.length(); index++) {
            resultingString.append(string.charAt(index)).append(string.charAt(index));
        }
        System.out.println("\n Новая строка после повторения символов :\n \"" + resultingString + "\".");
    }
}

