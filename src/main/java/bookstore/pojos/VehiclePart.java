package bookstore.pojos;

import java.util.Objects;

public abstract class VehiclePart extends Product {

    private String manufacturer;
    private double price;
    private int copies;

    public VehiclePart() {
        super();
    }


    public VehiclePart(String manufacturer, double price) {
        super();
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return this.copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void sellItem() {
        if (this.copies > 0) {
            this.copies--;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiclePart that = (VehiclePart) o;
        boolean b = Double.compare(that.getPrice(), getPrice()) == 0 &&
                Objects.equals(getManufacturer(), that.getManufacturer());
        return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getPrice());
    }
}