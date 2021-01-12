package enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Type {

    CRUISE(EnumSet.of(Town.NEAL_EGYPT, Town.MISSISSIPPI_USA, Town.AMAZON_BRAZIL, Town.NORWEGIAN_FJORDS, Town.CARIBBEAN_SEA),
            EnumSet.of(Transport.SHIP),
            EnumSet.of(Food.BED_BREAKFAST, Food.HALF_BOARD, Food.FULL_BOARD, Food.ALL_INCLUSIVE)),
    EXCURSION(EnumSet.of(Town.FLORENCE, Town.ROME, Town.PRAGUE, Town.BARCELONA, Town.ST_PETERSBURG, Town.BUDAPEST),
            EnumSet.of(Transport.PLANE, Transport.BUS),
            EnumSet.of(Food.BED_BREAKFAST, Food.HALF_BOARD, Food.FULL_BOARD, Food.ALL_INCLUSIVE)),
    MEDICINE(EnumSet.of(Town.DEAD_SEA_ISRAEL, Town.HEVIZ_HUNGARY, Town.BORZHOMI_GEORGIA, Town.KUDOWA_ZDROJ_POLAND, Town.PIESTANY_SLOVAKIA),
            EnumSet.of(Transport.PLANE, Transport.BUS),
            EnumSet.of(Food.BED_BREAKFAST, Food.HALF_BOARD, Food.FULL_BOARD, Food.ALL_INCLUSIVE)),
    SHOPPING(EnumSet.of(Town.NEW_YORK, Town.MILAN, Town.TOKYO, Town.PARIS, Town.HONG_KONG),
            EnumSet.of(Transport.PLANE, Transport.BUS),
            EnumSet.of(Food.BED_BREAKFAST, Food.HALF_BOARD, Food.FULL_BOARD, Food.ALL_INCLUSIVE)),
    WEEKEND(EnumSet.of(Town.DRESDEN, Town.VIENNA, Town.CESKY_KRUMLOV, Town.BERN, Town.BRUSSELS, Town.VENICE),
            EnumSet.of(Transport.PLANE, Transport.BUS),
            EnumSet.of(Food.BED_BREAKFAST, Food.HALF_BOARD, Food.FULL_BOARD, Food.ALL_INCLUSIVE));

    private final List<Town> towns;
    private final List<Transport> transports;
    private final List<Food> foods;

    Type(final EnumSet<Town> towns, final EnumSet<Transport> transports, final EnumSet<Food> foods) {
        this.towns = new ArrayList<>(towns);
        this.transports = new ArrayList<>(transports);
        this.foods = new ArrayList<>(foods);
    }

    public List<Town> getTowns() {
        return towns;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public List<Food> getFoods() {
        return foods;
    }
}



