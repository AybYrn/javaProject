package javaproject;

import java.util.ArrayList;

public class FlightSys {

    private static ArrayList<Flight> arr = new ArrayList(); //stores all flights

    public static boolean isFlightIdExists(String fId) {
        for (Flight fl : arr) {
            if (fl.checkId(fId)) {
                return true;
            }
        }
        return false;
    }

    public static boolean addFlight(String flightType, String flightId, String flighDateTime, String fToD, int gate, double price, int tcNo, String passportId, double cargoWeight) {
        DomesticFlight dF;
        InternationalFlight interF;

        if (!isFlightIdExists(flightId)) {
            if (flightType.equalsIgnoreCase("Domestic Flight")) {
                dF = new DomesticFlight(flightId, flighDateTime, fToD, gate, price, tcNo);
                arr.add(dF);
            } else if (flightType.equalsIgnoreCase("International Flight")) {
                interF = new InternationalFlight(flightId, flighDateTime, fToD, gate, price, passportId, cargoWeight);
                arr.add(interF);
            }
            return true;
        }
        return false;

    }

    public static String display() {
        String out = "";
        if (!arr.isEmpty()) {

            Flight temp;

            for (int i = 0; i < arr.size(); i++) {
                temp = (Flight) arr.get(i);
                out += (i + 1) + "- " + temp.toString() + "\n-----------------------\n";
            }
        } else {
            out = "There is no available flight !";
        }

        return out;

    }

    public static ArrayList<Flight> getArr() {
        return arr;
    }

    public static boolean removeFlight(String fId) {
        for (int i = 0; i < arr.size(); i++) {
            String flightId = arr.get(i).getFlightId();
            if (flightId.equalsIgnoreCase(fId)) {
                arr.remove(i);
                return true;
            }
        }
        return false;
    }

}
