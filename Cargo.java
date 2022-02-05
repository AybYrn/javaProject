/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author torkan
 */
class Cargo {
    private double weight;
    
     public Cargo(double weight) {
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }
     

    @Override
    public String toString() {
        return "Cargo{" + "weight=" + weight + '}';
    }
     
    
    
}
