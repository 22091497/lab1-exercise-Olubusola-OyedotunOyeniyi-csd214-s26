package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TireTest {

    @Test
    void testEquality() {
        Tire tire1 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire tire2 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire differentTire = new Tire("Goodyear", 130.00, 16.0, "Winter", 5);

        assertEquals(tire1, tire2, "Twin items must be evaluated as identical items.");
        assertNotEquals(tire1, differentTire, "Items with different attributes should not be equal.");
        assertEquals(tire1.hashCode(), tire2.hashCode(), "Matching items must produce the same hash code.");
    }

    @Test
    void testConstructor() {

        Tire myTire = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);


        assertEquals(17.0, myTire.getDiameter());


        assertEquals("Michelin", myTire.getManufacturer(), "Parent manufacturer field must be populated via constructor chaining.");
        assertEquals(150.00, myTire.getPrice(), "Parent price field must be populated via constructor chaining.");
    }

    @Test
    void testSellItemDecrementsStock() {
        Tire item = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        item.sellItem();
        assertEquals(4, item.getCopies(), "sellItem() must decrease the copies count by exactly 1.");
    }
}