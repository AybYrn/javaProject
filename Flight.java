/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Lenovo
 */
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
        return "\nFlight\n"
                + "----------\n"
                + "FlightId= " + flightId
                + "\nFligh Date & Time= " + flighDateTime
                + "\nFrom to Destination= " + fromtoDest
                + "\nGate= " + gate
                + "\nPrice=" + price;
    }

}
