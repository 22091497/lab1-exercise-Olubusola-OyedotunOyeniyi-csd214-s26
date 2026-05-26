package bookstore;

import bookstore.pojos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final List<SaleableItem> items = new ArrayList<>();
    private final CashTill cashTill = new CashTill();
    private Scanner input = new Scanner(System.in);

    private void addItem(SaleableItem item) {
        int choice = 0;
        while (choice != 99) {
            System.out.println("\nAdd an item\n");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DiscMag");
            System.out.println("4. Add Ticket");
            System.out.println("5. Add Tire");
            System.out.println("6. Add Battery");
            System.out.println("99. Exit");

            try {
                String line = input.nextLine();
                if (line.trim().isEmpty()) continue;
                choice = Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                choice = 0;
            }


                if (choice == 99) return;

            SaleableItem item = null;
            switch(choice) {
                case 1: item = new Book(); break;
                case 2: item = new Magazine(); break;
                case 3: item = new DiscMag(); break;
                case 4: item = new Ticket(); break;
                case 5: item = new Tire(); break;
                case 6: item = new Battery(); break;
                default:
                    System.out.println("Invalid selection.");
                    continue;
            }

            if (item instanceof Editable) {
                ((Editable) item).initialize(this.input);
            }

            addItem(item);
        }
    }

    public void run() {
    }

    public List<SaleableItem> getItems() {
        return items;
    }

    public CashTill getCashTill() {
        return cashTill;
    }