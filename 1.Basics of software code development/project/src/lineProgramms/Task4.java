
/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
     дробную и целую части числа и вывести полученное значение числа.  */

package lineProgramms;

public class Task4 {
    public static void main(final String[] args) {

        final float number = 111.555f;
        float result = (((number * 1000) - (int) number * 1000)) + ((float) ((int) number) / 1000);

        System.out.println("\n Результат преобразования числа " + number + " равен " + result + ".");
    }
}


