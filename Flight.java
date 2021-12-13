package javaproject;

public abstract class Flight {

    protected String flightId;
    protected String flighDateTime;
    protected String fromtoDest;
    protected int gate;
    protected double price;
    protected static int numOfFlight = 0;

    public Flight(String flightId, String flighDateTime, String fromtoDest, int gate, double price) {
        this.flightId = flightId;
        this.flighDateTime = flighDateTime;
        this.fromtoDest = fromtoDest;
        this.gate = gate;
        this.price = price;
        
        numOfFlight++;
    }

    public boolean checkId(String flightId) {
        return this.flightId.equalsIgnoreCase(flightId);
    }

    public abstract void calculatePrice();

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return    "Flight No= " + flightId
                + "\nFlight Date & Time= " + flighDateTime
                + "\nFrom to Destination= " + fromtoDest
                + "\nGate= " + gate
                + "\nPrice=" + price;
                
                
                 
    }
}
