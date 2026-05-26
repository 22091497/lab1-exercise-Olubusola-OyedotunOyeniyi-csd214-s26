package bookstore.pojos;

public abstract class VehiclePart extends Product {
    // Private attributes matching the UML diagram
    private String manufacturer;
    private double price;

    // Default No-Argument Constructor
    public VehiclePart() {
        super();
    }

    // Parameterized Constructor
    public VehiclePart(String manufacturer, double price) {
        super();
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Overridden method implementation from the SaleableItem interface
    @Override
    public double getPrice() {
        return this.price;
    }

    // Standard Getter and Setter methods
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