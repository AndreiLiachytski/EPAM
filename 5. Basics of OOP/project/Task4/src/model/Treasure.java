package model;

import java.io.Serial;
import java.io.Serializable;

public class Treasure implements Serializable {

    @Serial
    private static final long serialVersionUID = -6849794470754667718L;
    private static int ordinalNumber;

    private String name;
    private String material;
    private int price;
    private String owner;

    public Treasure() {
    }

    public Treasure(final String name, final String material, final int price, final String owner) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.owner = owner;
    }

    public static void setOrdinalNumber(final int ordinalNumber) {
        Treasure.ordinalNumber = ordinalNumber;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " Сокровище № " + ordinalNumber
                + " - '" + name
                + "', материал '" + material
                + "', цена '" + price
                + "', владелец '" + owner
                + "'.";
    }
}
