
/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Airline {

    private final String destination ;
    private final String flightTime ;
    private final String day;

    public Airline(final String destination, final int numberOfFlight, final String typeOfPlane, final String flightTime, final String day) {
        this.destination = destination;
        this.flightTime = flightTime;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Рейс Brest/" + destination +  " день вылета " + day  + ", время вылета "+ flightTime + ".";
    }
}
