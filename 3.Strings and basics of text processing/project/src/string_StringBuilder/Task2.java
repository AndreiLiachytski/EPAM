
//2. В строке вставить после каждого символа 'a' символ 'b'.

package string_StringBuilder;

public class Task2 {
    public static void main(final String[] args) {

        String string = "aaa ac ac ac";
        string = string.replace("a", "ab");

        System.out.println("\n Строка после вставок :\n \"" + string + "\"");
    }
}
