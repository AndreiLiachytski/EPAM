
/*5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/

package arrays;

public class Task5 {
    public static void main(final String[] args) {

        String str = "     some  word,  some    numbers 1 1  22    3333    ";
        str = str.trim();
        int length;

        do {
            length = str.length();
            str = str.replace("  ", " ");
        }
        while (str.length() != length);

        System.out.println("\n Строка после обработки : \n " + "\"" + str + "\"");
    }
}



