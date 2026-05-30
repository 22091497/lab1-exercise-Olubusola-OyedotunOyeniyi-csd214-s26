package bookstore.pojos;

import java.util.Scanner;

public class Tire extends VehiclePart {
    private double diameter;

    public Tire(String manufacturer, double price, double diameter, String tireType, int i) {
        super(manufacturer, price);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tire tire = (Tire) o;
        return Double.compare(tire.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), diameter);
    }

    @Override
    protected void setCopies(int copies) {

    }

    @Override
    public int getCopies() {
        return 0;
    }

    @Override
    public void edit(Scanner input) {

    }

    @Override
    public void initialize(Scanner input) {

    }

    @Override
    public void sellItem() {

    }
}