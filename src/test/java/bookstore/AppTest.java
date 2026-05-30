package bookstore;

import bookstore.pojos.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final InputStream originalSystemIn = System.in;


    @AfterEach
    public void tearDown() {
        System.setIn(originalSystemIn);
    }

    @Test
    public void testAppFlow_AddCustomNiche() {
        StringBuilder script = new StringBuilder();


        script.append("1\n");
        script.append("1\n");
        script.append("Michelin\n");
        script.append("150.00\n");
        script.append("18\n");
        script.append("All-Season\n");
        script.append("99\n");

        script.append("2\n");
        script.append("0\n");
        script.append("Bridgestone\n");
        script.append("\n");
        script.append("\n");
        script.append("\n");

        script.append("99\n");

        System.setIn(new ByteArrayInputStream(script.toString().getBytes()));

        App app = new App() {
            @Override
            public void populate() {
            }
        };
        app.run();

        assertNotNull(app.findItem("Bridgestone"), "The custom niche item should be found in the application's list.");
    }
}