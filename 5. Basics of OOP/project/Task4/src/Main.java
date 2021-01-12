import logic.Logic;
import model.Treasure;
import treasureServis.ReadFromFile;
import treasureServis.WriteToFile;
import treasureStorage.Storage;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final Logic logic = new Logic();

        List<Treasure> basket = null;
        int whileCell = -1;

        System.out.println("\nДобро пожаловать в пещеру сокровищ :)");
        while (whileCell != 0) {
            Storage.listOfTreasure = ReadFromFile.read();
            System.out.println("\n     *************           " +
                    "\n Для выбора введите цифру ('0'- выход)\n" +
                    " 1.Просмотр сокровищ \n" +
                    " 2.Выбор самого дорого сокровища \n" +
                    " 3.Формирование корзины\n" +
                    " 4.Просмотр корзины\n" +
                    " 5.Удаление сокровища\n" +
                    " 6.Добавление своего сокровища\n");
            try {
                whileCell = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Введите корректное значение ");
                scanner.nextLine();
            }
            switch (whileCell) {
                case 1 -> {
                    System.out.println("     *************\n Список сокровищ :");
                    logic.printList(Storage.listOfTreasure);
                }
                case 2 -> logic.getMostExpensiveTreasure();
                case 3 -> basket = logic.getBasket();
                case 4 -> {
                    if (basket == null) {
                        System.out.println("Сначала сформируйте корзину ");
                    } else {
                        System.out.println(" Корзина ");
                        logic.printList(basket);
                    }
                }
                case 5 -> logic.deleteTreasure();
                case 6 -> logic.addTreasure();
                case 0 -> System.out.println(" Хорошего дня ");
                default -> System.out.println(" Такой пункт меню не доступен ");
            }
        }
        WriteToFile.write(Storage.listOfTreasure);
    }
}




