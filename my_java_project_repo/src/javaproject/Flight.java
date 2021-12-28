package javaproject;

public abstract class Flight {

    protected String flightId;
    protected String flighDateTime;
    protected String fromtoDest;
    protected int gate;
    protected double price;
    protected static int numOfFlight = 0;
    protected String seat;
    protected String nameSurname;
    protected boolean lastPriced=false;
    

    public Flight(String flightId, String flighDateTime, String fromtoDest, int gate, double price,String seat,String nmeSrname) {
        this.flightId = flightId;
        this.flighDateTime = flighDateTime;
        this.fromtoDest = fromtoDest;
        this.gate = gate;
        this.price = price;
        this.seat = seat;
        this.nameSurname=nmeSrname;
        numOfFlight++;
    }

    public boolean checkId(String flightId) {
        return this.flightId.equalsIgnoreCase(flightId);
    }

    public abstract void calculatePrice();

    public String getFlightId() {
        return flightId; 
    }
    public String getFlightDateTime() {
        return flighDateTime;
    }
    public String getFromToDest() {
        return fromtoDest;
    }
    
    public void setNameSurname(String ns){
        this.nameSurname = ns;
    }
   
    public String getNameSurname(){
        return nameSurname;
    }
   
    public String getSeat(){
        return seat;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    
    public int getGate(){
        return gate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
       return price;
    }
    
    

    @Override
    public String toString() {
        return    "Flight No= " + flightId
                + "\nFlight Date & Time= " + flighDateTime
                + "\nFrom to Destination= " + fromtoDest
                + "\nGate= " + gate
                + "\nPrice=" + price+" TL";
                
                
                 
    }
}
