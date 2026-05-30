package bookstore.pojos;

import java.util.Scanner;

public class Tire extends VehiclePart {
    private double diameter;
    private String tireType;

    // Corrected 5-argument constructor matching TireTest.java
    public Tire(String manufacturer, double price, double diameter, String tireType, int copies) {
        super(manufacturer, price);
        this.diameter = diameter;
        this.tireType = tireType;
        this.setCopies(copies);
    }

    public double getDiameter() {
        return this.diameter;
    }

    public String getTireType() {
        return this.tireType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tire tire = (Tire) o;
        return Double.compare(tire.getDiameter(), getDiameter()) == 0 &&
                java.util.Objects.equals(getTireType(), tire.getTireType());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getDiameter(), getTireType());
    }

    @Override
    public void edit(Scanner input) {

    }

    @Override
    public void initialize(Scanner input) {

    }
}