package storage;

import enums.Food;
import enums.Town;
import enums.Transport;
import enums.Type;

import java.time.LocalDate;
import java.util.List;

public class TourParameters {

    private final Type typeOfTour;
    private final Town town;
    private final LocalDate startDate;
    private final LocalDate finishDate;
    private final Food food;
    private final Transport transport;

    public TourParameters() {
        this(null);
    }

    public TourParameters(final Type type) {
        this.typeOfTour = type == null ? choseType() : type;
        this.town = choseTown(typeOfTour.getTowns());
        this.startDate = choseFirstDay();
        this.finishDate = choseLastDay(startDate);
        this.food = choseFood(typeOfTour.getFoods());
        this.transport = choseTransport(typeOfTour.getTransports());
    }

    private Type choseType() {
        final Type[] types = Type.values();
        final int randomTypeIndex = (int) (Math.random() * types.length);
        return types[randomTypeIndex];
    }

    private Town choseTown(final List<Town> towns) {
        final int randomTownIndex = (int) (Math.random() * towns.size());
        return towns.get(randomTownIndex);
    }

    private LocalDate choseFirstDay() {
        return LocalDate.now().plusDays((int) ((Math.random() * 15) + 5));
    }

    private LocalDate choseLastDay(final LocalDate startDate) {
        return startDate.plusDays((int) ((Math.random() * 10) + 2));
    }

    private Food choseFood(final List<Food> foods) {
        final int randomFoodIndex = (int) (Math.random() * foods.size());
        return foods.get(randomFoodIndex);
    }

    private Transport choseTransport(final List<Transport> transports) {
        final int randomTownIndex = (int) (Math.random() * transports.size());
        return transports.get(randomTownIndex);
    }

    @Override
    public String toString() {
        return "Параметры путевки { тип тура " + typeOfTour +
                ", пункт назначения " + town +
                ", дата начала/окончания " + startDate +
                "/" + finishDate +
                ", тип питания " + food +
                ", транспорт " + transport +
                " }";
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Food getFood() {
        return food;
    }

    public Transport getTransport() {
        return transport;
    }
}
