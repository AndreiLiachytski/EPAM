package logic;

import enums.Food;
import enums.Transport;
import enums.Type;
import storage.TourParameters;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logic {

    static ArrayList<TourParameters> listOffers = new ArrayList<>();

    static public void getListOffers(char[] type) {
        for (final char symbol : type) {
            if (!Character.isDigit(symbol)) {
                continue;
            }
            switch (Character.getNumericValue(symbol)) {
                case 1 -> addChooseType(listOffers, Type.CRUISE);
                case 2 -> addChooseType(listOffers, Type.EXCURSION);
                case 3 -> addChooseType(listOffers, Type.MEDICINE);
                case 4 -> addChooseType(listOffers, Type.SHOPPING);
                case 5 -> addChooseType(listOffers, Type.WEEKEND);
                case 6 -> addTours(listOffers);
            }
        }
        listOffers.stream()
                .sorted(Comparator.comparing(TourParameters::getStartDate))
                .forEach(System.out::println);
    }

    static public void getFilteredList(char[] type) {
        List<TourParameters> filteredList = new ArrayList<>();
        for (final char symbol : type) {
            if (!Character.isDigit(symbol)) {
                continue;
            }
            switch (Character.getNumericValue(symbol)) {
                case 1:
                    filteredList = listOffers.stream().filter((t -> t.getFood() == Food.BED_BREAKFAST)).collect(Collectors.toList());
                    break;
                case 2:
                    filteredList = listOffers.stream().filter((t -> t.getFood() == Food.HALF_BOARD)).collect(Collectors.toList());
                    break;
                case 3:
                    filteredList = listOffers.stream().filter((t -> t.getFood() == Food.FULL_BOARD)).collect(Collectors.toList());
                    break;
                case 4:
                    filteredList = listOffers.stream().filter((t -> t.getFood() == Food.ALL_INCLUSIVE)).collect(Collectors.toList());
                    break;
                case 5:
                    if (filteredList.size() == 0) {
                        filteredList = listOffers.stream().filter((t -> t.getTransport() == Transport.BUS)).collect(Collectors.toList());
                    } else {
                        filteredList = filteredList.stream().filter((t -> t.getTransport() == Transport.BUS)).collect(Collectors.toList());
                    }
                    break;
                case 6:
                    if (filteredList.size() == 0) {
                        filteredList = listOffers.stream().filter((t -> t.getTransport() == Transport.PLANE)).collect(Collectors.toList());
                    } else {
                        filteredList = filteredList.stream().filter((t -> t.getTransport() == Transport.PLANE)).collect(Collectors.toList());
                    }
                    break;
            }
        }
        filteredList.stream().sorted(Comparator.comparing(TourParameters::getStartDate)).forEach(System.out::println);
    }

    static public void addTours(ArrayList<TourParameters> list) {
        for (int index = 0; index < 20; index++) {
            list.add(new TourParameters());
        }
    }

    static public void addChooseType(ArrayList<TourParameters> list, Type type) {
        for (int index = 0; index < 10; index++) {
            list.add(new TourParameters(type));
        }
    }

}


