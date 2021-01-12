
/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/

package string_StringBuilder;

public class Task9 {
    public static void main(final String[] args) {

        final String string = " АЯ ая AZ az";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int index = 0; index < string.length(); index++) {
            char symbol = string.charAt(index);
            if (Character.isUpperCase(symbol) && symbol >= 65 && symbol <= 90) {
                upperCaseCount++;
            } else if (Character.isLowerCase(symbol) && symbol >= 97 && symbol <= 122) {
                lowerCaseCount++;
            }
        }
        System.out.println("\n Количество английских прописных (больших) букв во введенной строке равно " + upperCaseCount + ".");
        System.out.println("\n Количество английских строчных (маленьких) букв во введенной строке равно " + lowerCaseCount + ".");
    }
}
