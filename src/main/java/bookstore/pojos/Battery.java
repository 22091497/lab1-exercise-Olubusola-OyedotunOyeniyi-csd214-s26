package bookstore.pojos;

import java.util.Scanner;

public class Battery extends VehiclePart {
    // 1. Concrete Subclass Fields
    public int capacityAh;  // Battery capacity in Ampere-hours
    public int voltage;     // e.g., 12V, 24V

    // 2. Default No-Argument Constructor
    public Battery() {
        super();
    }

    // 3. Parameterized Constructor
    public Battery(String manufacturer, double price, int capacityAh, int voltage) {
        // Invokes the parent VehiclePart constructor to pass manufacturer and price
        super(manufacturer, price);
        this.capacityAh = capacityAh;
        this.voltage = voltage;
    }

    // 4. Getters and Setters
    public int getCapacityAh() {
        return capacityAh;
    }

    public void setCapacityAh(int capacityAh) {
        this.capacityAh = capacityAh;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    // 5. toString Override for Clean Debugging Output
    @Override
    public String toString() {
        return "Battery{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", capacityAh=" + capacityAh +
                "Ah, voltage=" + voltage +
                "V" +
                '}';
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