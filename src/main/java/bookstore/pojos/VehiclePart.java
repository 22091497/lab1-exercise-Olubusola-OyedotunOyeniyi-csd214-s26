package bookstore.pojos;

public abstract class VehiclePart extends Product {
    // 1. Private Fields
    private String manufacturer;
    private double price;

    // 2. Default No-Argument Constructor
    public VehiclePart() {
        super(); // Invokes the parent Product constructor
    }

    // 3. Parameterized Constructor
    public VehiclePart(String manufacturer, double price) {
        super(); // Invokes the parent Product constructor
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // 4. Overridden Method from SaleableItem Interface
    @Override
    public double getPrice() {
        return this.price;
    }

    // 5. Getters and Setters (Standard for Java Beans/POJOs)
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