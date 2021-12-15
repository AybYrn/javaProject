package javaproject;

public class DomesticFlight extends Flight {

    private int turkishIdentityNum;

    public DomesticFlight(String flightId, String flighDateTime, String fromtoDest, int gate, double price, int turkishIdentityNum) {
        super(flightId, flighDateTime, fromtoDest, gate, price);
        this.turkishIdentityNum = turkishIdentityNum;
    }

    @Override
    public void calculatePrice() {
        double airportServiceCharge = 50;
        double vatRatio = 0.15; //vat(kdv)ratio %18
        this.price += (price*vatRatio)+airportServiceCharge;
        
        
    }

    public double getPrice() {
        return price;
    }
    
    

    public int getTurkishIdentityNum() {
        return turkishIdentityNum;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
