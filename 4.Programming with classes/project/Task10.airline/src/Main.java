
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(final String[] args) {

        ArrayList<Airline> planes = new ArrayList<>();
        planes.add(new Airline("Prague", 343, "Bombardier Q300", "12:53", "Суббота"));
        planes.add(new Airline("Havana", 551, "Saab 2000", "22:30", "Пятница"));
        planes.add(new Airline("Moscow", 789, "Airbus A320", "06:48", "Среда"));
        planes.add(new Airline("Copenhagen", 679, "Boeing 747", "08:10", "Суббота"));
        planes.add(new Airline("Rio-de-Janeiro", 545, "Boeing 777-200LR", "12:00", "Вторник"));
        planes.add(new Airline("Reykjavik", 297, "Concorde 202", "21:07", "Понедельник"));
        planes.add(new Airline("Berlin", 753, "Airbus B-767", "15:00", "Четверг"));
        planes.add(new Airline("Budapest", 453, "Saab 340", "13:23", "Суббота"));
        planes.add(new Airline("Jakarta", 731, "Boeing 747", "19:55", "Вторник"));
        planes.add(new Airline("Rome", 963, "Bombardier Q300", "10:00", "Среда"));
        planes.add(new Airline("Tokyo", 1368, "Saab 340", "07:45", "Четверг"));
        planes.add(new Airline("Reykjavik", 649, "Boeing 747", "05:00", "Воскресение"));
        planes.add(new Airline("Madrid", 169, "Concorde 201", "21:25", "Пятница"));
        planes.add(new Airline("Monaco", 851, "Boeing 737", "13:00", "Четверг"));
        planes.add(new Airline("Madrid", 781, "Saab 340", "23:57", "Суббота"));
        planes.add(new Airline("Warsaw", 951, "Boeing 747", "16:15", "Понедельник"));
        planes.add(new Airline("Belgrade", 725, "Saab 2000", "20:02", "Воскресение"));
        planes.add(new Airline("Madrid", 715, "Airbus A330", "01:25", "Суббота"));

        System.out.println("\nСписок рейсов для заданного пункта назначения :");
        final String findingDestination = "Reykjavik";
        planes.stream()
                .filter((destination -> destination.getDestination().equals(findingDestination)))
                .sorted(Comparator.comparing(Airline::getDay)
                        .thenComparing(Airline::getFlightTime))
                .forEach(System.out::println);

        final String findingDay = "Суббота";
        System.out.println("\nСписок рейсов для которых день вылета " + findingDay + " :");
        planes.stream()
                .filter((destination -> destination.getDay().equals(findingDay)))
                .sorted(Comparator.comparing(Airline::getFlightTime))
                .forEach(System.out::println);

        final String time = "13:00";
        System.out.println("\nСписок рейсов для которых день вылета " + findingDay + ", время вылета после " + time + " :");
        planes.stream()
                .filter((destination -> destination.getDay().equals(findingDay)))
                .filter(flightTime -> flightTime.getFlightTime().compareTo(time) >= 0)
                .sorted(Comparator.comparing(Airline::getFlightTime))
                .forEach(System.out::println);
    }
}