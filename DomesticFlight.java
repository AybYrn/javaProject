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
public class DomesticFlight extends Flight {

    private int turkishIdentityNum;

    public DomesticFlight(String flightId, String flighDateTime, String fromtoDest, int gate, double price, int turkishIdentityNum) {
        super(flightId, flighDateTime, fromtoDest, gate, price);
        this.turkishIdentityNum = turkishIdentityNum;
    }

    @Override
    public void calculatePrice() {

    }

    public int getTurkishIdentityNum() {
        return turkishIdentityNum;
    }

    @Override
    public String toString() {
        return "\nDomestic Flight\n"
                + "-----------------\n"
                + super.toString()
                + "\nTC N= " + turkishIdentityNum;
    }

}
