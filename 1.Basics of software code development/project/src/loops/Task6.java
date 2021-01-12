
//6. Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.

package loops;

public class Task6 {
    public static void main(final String[] args) {

        int newLine = 0;

        for (int index = 32; index <= 256; index++) {

            if (newLine <= 16) {
                System.out.print(index + " " + "-- " + (char) index + " ; ");
                newLine++;
            } else {
                System.out.println();
                newLine = 0;
            }
        }
    }
}
