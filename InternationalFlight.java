/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javaproject.Flight;

/**
 *
 * @author torkan
 */
public class InternationalFlight extends Flight{
    
    private String passportId;
    private Cargo cargo;
    public InternationalFlight(String flightId, String flighDateTime, String fromtoDest, int gate, double price,String passportId,Cargo cargo) {
        super(flightId, flighDateTime, fromtoDest, gate, price);
        this.passportId= passportId;
        this.cargo=cargo;
    }
    @Override
    public void calculatePrice() {

    }
    public String getPassportId() {
        return passportId;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "InternationalFlight{" + 
                "passportId=" + passportId + 
                ", cargo=" + cargo + '}';
    }

    
}
