package bookstore.pojos;

public abstract class VehiclePart extends Product {

    private String manufacturer;
    private double price;

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
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}