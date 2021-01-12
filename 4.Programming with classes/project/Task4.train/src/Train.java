
/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
*/

class Train {

    private final String town;
    private final int trainNumber;
    private final String time;

    public Train(final String town, final int trainNumber, final String time) {
        this.town = town;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public String getTown() {
        return town;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Поезд № " + trainNumber +
                ", время отправления " + time +
                ", следует до станции " + town + ".";
    }
}