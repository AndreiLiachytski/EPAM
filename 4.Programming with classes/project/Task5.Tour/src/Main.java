import logic.Logic;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип путевки(цифры от 1 до 6):\n" +
                "   1.Круиз\n" +
                "   2.Экскурсия\n" +
                "   3.Оздоровительный туризм\n" +
                "   4.Шопинг\n" +
                "   5.Тур выходного дня\n" +
                "   6.Все варианты\n" +
                "Введите цифры :"
        );
        Logic.getListOffers(scanner.nextLine().toCharArray());

        System.out.println("\nДля дальнейшей фильтрации списка введите '1', для выхода из программы введите '0':");
        switch (scanner.nextInt()) {
            case 0 -> System.out.println("До свидания.");
            case 1 -> {
                System.out.println("Выберите критерии для фильтрации(останутся выбранные варианты) :\n" +
                        "По типу питания :\n" +
                        "   1.BED_BREAKFAST\n" +
                        "   2.HALF_BOARD\n" +
                        "   3.FULL_BOARD\n" +
                        "   4.ALL_INCLUSIVE\n" +
                        "По типу транспорта :\n" +
                        "   5.BUS\n" +
                        "   6.PLANE"
                );
                scanner.nextLine();
                Logic.getFilteredList(scanner.nextLine().toCharArray());
            }
        }
    }
}
