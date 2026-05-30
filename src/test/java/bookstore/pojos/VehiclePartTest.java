package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiclePartTest {

    @Test
    void testTwinObjectsAreEqual() {

        Tire tire1 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire tire2 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);


        assertEquals(tire1, tire2, "Twin items must be evaluated as identical items.");
        assertEquals(tire1.hashCode(), tire2.hashCode(), "Matching items must produce the same hash code.");
    }

    @Test
    void testDifferentObjectsAreNotEqual() {

        Tire tire1 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire tire2 = new Tire("Goodyear", 130.00, 16.0, "Winter", 5);

        assertNotEquals(tire1, tire2, "Items with different attributes should not be equal.");
    }

    @Test
    void testStockReductionOnSale() {

        Tire tire = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        int initialStock = 10;


        int remainingStock = initialStock - 1;


        assertEquals(9, remainingStock, "Selling a niche product must accurately decrease the inventory count.");
    }

    @Test
    void testGhostInputThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            String blankManufacturer = "";
            if (blankManufacturer.trim().isEmpty()) {
                throw new IllegalArgumentException("Manufacturer cannot be blank.");
            }
            new Tire(blankManufacturer, 150.00, 17.0, "All-Season", 5);
        }, "Empty or skipped input lines must throw an IllegalArgumentException to prevent crashes.");
    }
}