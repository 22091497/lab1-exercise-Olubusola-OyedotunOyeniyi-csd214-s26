package bookstore.pojos;

import java.util.Scanner;

public class Battery extends VehiclePart {
    private int cca;


    public Battery(String manufacturer, double price, int cca, int copies) {
        super(manufacturer, price);
        this.cca = cca;
        this.setCopies(copies);
    }

    public int getCca() {
        return cca;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Battery battery = (Battery) o;
        return cca == battery.cca;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), cca);
    }

    @Override
    public void setCopies(int copies) {

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