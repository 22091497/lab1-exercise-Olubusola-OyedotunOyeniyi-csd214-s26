package bookstore;

import bookstore.pojos.*;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public final List<SaleableItem> items = new ArrayList<>();
    public final CashTill cashTill = new CashTill();
    public Scanner input = new Scanner(System.in);

    public void populate() {
        Faker faker = new Faker();

        for (int i = 0; i < 3; i++) {
            String manufacturer = faker.company().name();
            double price = faker.number().randomDouble(2, 80, 300);
            int size = faker.number().numberBetween(15, 22);
            String tireType = faker.options().option("All-Season", "Winter", "Performance");

            items.add(new Tire(manufacturer, price, size, tireType, 5));
        }


        for (int i = 0; i < 3; i++) {
            String manufacturer = faker.company().name();
            double price = faker.number().randomDouble(2, 90, 250);
            int capacity = faker.number().numberBetween(45, 110);
            int voltage = faker.options().option(12, 24);

            items.add(new Battery(manufacturer, price, capacity, voltage));
        }
        System.out.println(">>> System seeded with 6 vehicle parts via JavaFaker.");
    }

    public void run() {
        populate();

    }

    public List<SaleableItem> getItems() { return items; }
    public CashTill getCashTill() { return cashTill; }
    public Scanner getInput() { return input; }
    public void setInput(Scanner input) { this.input = input; }

    public Object findItem(String bridgestone) {

        return null;
    }
}