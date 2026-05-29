package bookstore.pojos;

import java.util.Scanner;

public class Battery extends VehiclePart {
    private int capacityAh;
    private int voltage;

    public Battery() {
        super();
    }

    public Battery(String manufacturer, double price, int capacityAh, int voltage) {
        super(manufacturer, price);
        this.capacityAh = capacityAh;
        this.voltage = voltage;
    }

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

    @Override
    public String toString() {
        return "Battery{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", capacityAh=" + capacityAh + "Ah" +
                ", voltage=" + voltage + "V" +
                '}';
    }

    @Override
    public void initialize(Scanner input) {
        System.out.print("Enter Manufacturer: ");
        setManufacturer(input.nextLine());
        System.out.print("Enter Price: ");
        setPrice(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Battery Capacity (Ah): ");
        this.capacityAh = Integer.parseInt(input.nextLine());
        System.out.print("Enter Battery Voltage (V): ");
        this.voltage = Integer.parseInt(input.nextLine());
    }

    @Override
    public void edit(Scanner input) {
        System.out.print("Enter New Manufacturer (Press Enter to keep current): ");
        String nextMan = input.nextLine();
        if (!nextMan.isBlank()) setManufacturer(nextMan);

        System.out.print("Enter New Price (Press Enter to keep current): ");
        String nextPrice = input.nextLine();
        if (!nextPrice.isBlank()) setPrice(Double.parseDouble(nextPrice));

        System.out.print("Enter New Capacity (Press Enter to keep current): ");
        String nextCap = input.nextLine();
        if (!nextCap.isBlank()) this.capacityAh = Integer.parseInt(nextCap);

        System.out.print("Enter New Voltage (Press Enter to keep current): ");
        String nextVolt = input.nextLine();
        if (!nextVolt.isBlank()) this.voltage = Integer.parseInt(nextVolt);
    }

    @Override
    public void sellItem() {
        System.out.println("Battery sold successfully!");
    }
}