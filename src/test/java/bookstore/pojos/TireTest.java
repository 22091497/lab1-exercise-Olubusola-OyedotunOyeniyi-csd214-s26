package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TireTest {

    @Test
    void testEquality() {
        Tire tire1 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire tire2 = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        Tire differentTire = new Tire("Goodyear", 130.00, 16.0, "Winter", 5);

        assertEquals(tire1, tire2);
        assertNotEquals(tire1, differentTire);
        assertEquals(tire1.hashCode(), tire2.hashCode());
    }

    @Test
    void testConstructor() {
        Tire myTire = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        assertEquals(17.0, myTire.getDiameter());
        assertEquals("Michelin", myTire.getManufacturer());
    }

    @Test
    void testSellItemDecrementsStock() {
        Tire item = new Tire("Michelin", 150.00, 17.0, "All-Season", 5);
        item.sellItem();
        assertEquals(4, item.getCopies());
    }
}