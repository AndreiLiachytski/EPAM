
//2. Замените в строке все вхождения 'word' на 'letter'.

package arrays;

public class Task2 {
    public static void main(final String[] args) {

        final String str = "word find word word some word";

        System.out.println("\n" + str.replace("word", "letter"));
    }
}
