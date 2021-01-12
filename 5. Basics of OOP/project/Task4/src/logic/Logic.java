package logic;

import model.Treasure;
import treasureStorage.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Logic {

    final Scanner scanner = new Scanner(System.in);

    public void addTreasure() {
        Treasure treasure = new Treasure();
        System.out.print("\nВведите название сокровища :");
        scanner.nextLine();
        treasure.setName(scanner.nextLine());
        System.out.print("\nВведите материал :");
        treasure.setMaterial(scanner.nextLine());
        System.out.print("\nВведите владельца :");
        treasure.setOwner(scanner.nextLine());
        System.out.print("\nВведите цену :");
        treasure.setPrice(scanner.nextInt());
        Storage.listOfTreasure.add(treasure);
        treasureServis.WriteToFile.write(Storage.listOfTreasure);
        System.out.println(" Сокровище добавлено ");
    }

    public void deleteTreasure() {
        System.out.println("\nВведите номер удаляемого сокровища :");
        Storage.listOfTreasure = treasureServis.ReadFromFile.read();
        Storage.listOfTreasure.remove((scanner.nextInt() - 1));
        treasureServis.WriteToFile.write(Storage.listOfTreasure);
        System.out.print(" Удаление выполнено ");
    }

    public void getMostExpensiveTreasure() {
        int maxPrice = Storage.listOfTreasure.stream().mapToInt(Treasure::getPrice).max().getAsInt();
        System.out.println("\n Самое дорогое сокровище :");
        Treasure.setOrdinalNumber(1);
        Storage.listOfTreasure.stream().filter((treasure -> treasure.getPrice() == maxPrice)).forEach(System.out::println);
    }

    public List<Treasure> getBasket() {
        final List<Treasure> basket = new ArrayList<>();
        List<Treasure> chooseList = treasureServis.ReadFromFile.read();
        int[] array = chooseList.stream().mapToInt(Treasure::getPrice).toArray();
        int minPrice = chooseList.stream().mapToInt(Treasure::getPrice).min().getAsInt();
        boolean bool = true;
        System.out.println("\n Сколько у вас есть денег ? :)");
        int cash = scanner.nextInt();

        if (cash < minPrice) {
            System.out.println(" У вас недостаточно денег :( ");
        } else {
            while (bool) {
                System.out.println("\n Доступные сокровища :");
                final int finalCash = cash;
                chooseList = chooseList.stream().filter(pr -> pr.getPrice() <= finalCash).collect(Collectors.toList());
                printList(chooseList);
                System.out.println("\n Введите номер желаемого сокровища :");
                int number = (scanner.nextInt() - 1);
                if (number < chooseList.size()) {
                    cash -= array[number];
                    basket.add(chooseList.get(number));
                    chooseList.remove(number);
                    array = chooseList.stream().mapToInt(Treasure::getPrice).toArray();
                    if (cash < minPrice) {
                        bool = false;
                        System.out.println(" Корзина сформирована :");
                    } else {
                        System.out.println("     ***********");
                        System.out.print(" Остаток денег :" + cash + "\n\n Корзина :\n");
                    }
                } else {
                    System.out.println(" Сокровища с таким номером не существует\n Корзина :");
                }
                printList(basket);
            }
        }
        return basket;
    }

    public void printList(final List<Treasure> list) {
        for (int index = 0; index < list.size(); index++) {
            final Treasure treasure = list.get(index);
            Treasure.setOrdinalNumber(index + 1);
            System.out.println(treasure.toString());
        }
        Treasure.setOrdinalNumber(0);
    }
}
