package javaproject;

public class Cargo {

    private double weight;

    public Cargo(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cargo{" + "weight=" + weight + '}';
    }

}
