
//3. Проверить, является ли заданное слово палиндромом.

package string_StringBuilder;

public class Task3 {
    public static void main(final String[] args) {

        final String string = "Мало пополам?";
        if (isPalindrome(string)) {
            System.out.println("\n" + string + "  \nДанная строка является палиндромом.\n");
        } else {
            System.out.println(" \nДанная строка не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < string.length(); index++) {
            result = Character.isLetter(string.charAt(index)) ? result.append(string.charAt(index)) : result;
        }
        boolean condition = false;

        for (int index = 0, j = result.length() - 1; index < result.length() - 1; index++, j--) {
            if (result.charAt(index) == result.charAt(j)) {
                condition = true;
            } else {
                break;
            }
        }
        return condition;
    }
}
