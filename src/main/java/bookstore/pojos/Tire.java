package bookstore.pojos;

import java.util.Scanner;

public class Tire extends VehiclePart {
    private int size;
    private String tireType;

    public Tire() {
        super();
    }

    public Tire(String manufacturer, double price, int size, String tireType) {
        super(manufacturer, price);
        this.size = size;
        this.tireType = tireType;
    }

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

    @Override
    public String toString() {
        return "Tire{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", size=" + size +
                ", tireType='" + tireType + '\'' +
                '}';
    }

    @Override
    public void initialize(Scanner input) {
        System.out.print("Enter Manufacturer: ");
        setManufacturer(input.nextLine());
        System.out.print("Enter Price: ");
        setPrice(Double.parseDouble(input.nextLine()));
        System.out.print("Enter Tire Size (inches): ");
        this.size = Integer.parseInt(input.nextLine());
        System.out.print("Enter Tire Type (e.g., Winter, Performance): ");
        this.tireType = input.nextLine();
    }

    @Override
    public void edit(Scanner input) {
        System.out.print("Enter New Manufacturer (Press Enter to keep current): ");
        String nextMan = input.nextLine();
        if (!nextMan.isBlank()) setManufacturer(nextMan);

        System.out.print("Enter New Price (Press Enter to keep current): ");
        String nextPrice = input.nextLine();
        if (!nextPrice.isBlank()) setPrice(Double.parseDouble(nextPrice));

        System.out.print("Enter New Size (Press Enter to keep current): ");
        String nextSize = input.nextLine();
        if (!nextSize.isBlank()) this.size = Integer.parseInt(nextSize);

        System.out.print("Enter New Tire Type (Press Enter to keep current): ");
        String nextType = input.nextLine();
        if (!nextType.isBlank()) this.tireType = nextType;
    }

    @Override
    public void sellItem() {
        System.out.println("Tire sold successfully!");
    }
}
