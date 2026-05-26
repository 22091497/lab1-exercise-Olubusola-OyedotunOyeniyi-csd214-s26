package bookstore;

import bookstore.pojos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public final List<SaleableItem> items = new ArrayList<>();
    public final CashTill cashTill = new CashTill();
    public Scanner input = new Scanner(System.in);

    public void run() {
    }

    public List<SaleableItem> getItems() {
        return items;
    }

    public CashTill getCashTill() {
        return cashTill;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }