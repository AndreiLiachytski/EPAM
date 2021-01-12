import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train("Moscow", 551, "22:05"));
        trains.add(new Train("Madrid", 171, "06:54"));
        trains.add(new Train("Moscow", 147, "08:00"));
        trains.add(new Train("Kharkov", 372, "14:00"));
        trains.add(new Train("Berlin", 192, "18:40"));
        trains.add(new Train("Moscow", 854, "22:01"));
        trains.add(new Train("Minsk", 646, "07:03"));
        trains.add(new Train("Moscow", 109, "09:15"));
        trains.add(new Train("Kiev", 202, "14:00"));
        trains.add(new Train("Budapest", 102, "19:00"));

        final Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        do {
            System.out.println("\nВыберите действие(введите цифру) :" +
                    "\n1.Отсортировать список по номерам поездов" +
                    "\n2.Отсортировать список по пункту назначения" +
                    "\n3.Показать информацию об интересующем поезде" +
                    "\n0.выход");
            switch (scanner.nextInt()) {
                case 1 -> trains.stream()
                        .sorted(Comparator.comparing(Train::getTrainNumber))
                        .forEach(System.out::println);
                case 2 -> trains.stream()
                        .sorted(Comparator.comparing(Train::getTown)
                                .thenComparing(Train::getTime))
                        .forEach(System.out::println);
                case 3 -> {
                    System.out.println("Введите номер поезда");
                    int index = scanner.nextInt();
                    trains.stream().filter((n -> n.getTrainNumber() == index))
                            .sorted(Comparator.comparing(Train::getTime))
                            .forEach(System.out::println);
                }
                case 0 -> bool = false;
                default -> System.out.println(" Вы выбрали некорректный вариант.");
            }
        } while (bool);
    }
}
