package javaproject;

import java.util.ArrayList;

public class TicketSys implements TicketInterface{

    
    private static String Class; //C must be capital due to reserved word "class"
    private static final int MAX_TICKET = 5; //assume user can buy max 5 ticket
    public static int count = 0; //count the ticket that purchased
    private static ArrayList<Flight> arr = new ArrayList<>(); //stores purchased flights
    
    
    //to prevent to buy same fligth twice
    public static boolean isFlightIdExists(String fId) {
        for (Flight fl : FlightSys.getArr()) {
            if (fl.checkId(fId)) {
                return true;
            }
        }
        return false;
    }

   

    public static void setClass(String clss) {
        Class = clss;
    }

    

    public static boolean addTicket(String flightType, String flightId, String flighDateTime, String fToD, int gate, double price, String tcNo, String passportId, double cargoWeight,String seat,String nameSurname) {
        DomesticFlight dF;
        InternationalFlight interF;

        if (isFlightIdExists(flightId) && count < MAX_TICKET) {

            if (flightType.equalsIgnoreCase("Domestic Flight")) {
                dF = new DomesticFlight(flightId, flighDateTime, fToD, gate, price, tcNo,seat,nameSurname);
                dF.setNameSurname(nameSurname);              
                arr.add(dF);
                count++;
                return true;

            } else if (flightType.equalsIgnoreCase("International Flight")) {
                interF = new InternationalFlight(flightId, flighDateTime, fToD, gate, price, passportId, cargoWeight,seat,nameSurname);
                interF.setNameSurname(nameSurname);
                arr.add(interF);
                count++;
                return true;
            }
            
        }
        return false;

    }

    public static String displayTicket() {
        String out;
        if (!arr.isEmpty()) {
            out = "You have " + arr.size() + " ticket(s)" + "\n" + "\tMy Tickets\n" + "--------------------" + "\n";
            Flight temp;

            for (int i = 0; i < arr.size(); i++) {
                temp = (Flight) arr.get(i);
                if (temp instanceof DomesticFlight) {
                    out += (i + 1) + "- " + temp.toString() +"\nName Surname= "+temp.getNameSurname() +"\n TC No= " + ((DomesticFlight) temp).getTurkishIdentityNum() + "\nSeat No= " + temp.getSeat() + "\n\n";
                } else {
                    out += (i + 1) + "- " + temp.toString() +"\nName Surname= "+temp.getNameSurname() +"\n Passport Id= " + ((InternationalFlight) temp).getPassportId() + "\nSeat No= " + temp.getSeat() + "\n\n";
                }

            }
        } else {
            out = "\n Your ticket list is empty :( ";
        }

        return out;
    }

    public static ArrayList<Flight> getArr() {
        return arr;
    }

    public static boolean removeTicket(String fId) {
        for (int i = 0; i < arr.size(); i++) {
            String flightId = arr.get(i).getFlightId();
            if (flightId.equalsIgnoreCase(fId)) {
                arr.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public static void calculateAllTicketPrice(){
        if(!arr.isEmpty()){
            for(Flight fl:arr){
                fl.calculatePrice();
            }
        }
    }

    @Override
    public double totalTicketPrice() {
        double sum=0;
        if(!arr.isEmpty()){
            for(Flight fl:arr){
                if(fl instanceof DomesticFlight)
                   sum+=((DomesticFlight)fl).getPrice();
                else{
                    sum+=((InternationalFlight)fl).getPrice();
                }
            }
            return sum;
        }else{
            return -1;
        }
        
        
    }

}
