package javaproject;

public class DomesticFlight extends Flight {

    private String turkishIdentityNum;

    public DomesticFlight(String flightId, String flighDateTime, String fromtoDest, int gate, double price, String turkishIdentityNum,String seat,String nameSurname) {
        super(flightId, flighDateTime, fromtoDest, gate, price,seat,nameSurname);
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
    
    
    
    public String getTurkishIdentityNum() {
        return turkishIdentityNum;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
