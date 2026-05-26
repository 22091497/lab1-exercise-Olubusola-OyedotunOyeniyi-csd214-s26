package bookstore.pojos;

public class Tire extends VehiclePart {
    // 1. Concrete Subclass Fields
    public int size;
    private String tireType; // e.g., "All-Season", "Winter", "Performance"

    // 2. Default No-Argument Constructor
    public Tire() {
        super();
    }

    // 3. Parameterized Constructor
    public Tire(String manufacturer, double price, int size, String tireType) {
        // Invokes the parent VehiclePart constructor to pass manufacturer and price
        super(manufacturer, price);
        this.size = size;
        this.tireType = tireType;
    }

    // 4. Getters and Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    // 5. toString Override for Clean Debugging Output
    @Override
    public String toString() {
        return "Tire{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", size=" + size +
                ", tireType='" + tireType + '\'' +
                '}';
    }
}