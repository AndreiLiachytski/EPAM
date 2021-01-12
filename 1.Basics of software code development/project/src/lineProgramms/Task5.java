
/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 длительности в часах, минутах и секундах в следующей форме:  ННч ММмин SSc.  */

package lineProgramms;

public class Task5 {
    public static void main(final String[] args) {

        final long T = 15002;
        final long hours = T / 3600;
        final long minutes = (T / 60) - (hours * 60);
        final long seconds = (T - (hours * 3600) - (minutes * 60));

        System.out.println("\n " + hours + "ч : " + minutes + "мин : " + seconds + "с.");
    }
}
