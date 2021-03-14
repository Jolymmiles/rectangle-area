import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public TestMain() {
        Locale.setDefault(new Locale("en", "US"));
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainFirst() {
        String data = "12.3\r\n14.4\r\n11.3\r\n15.4";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double expected = 1.0;
        double actual = Double.parseDouble(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, Math.round(actual * 10) / 10.0);
    }

    @Test
    public void testMainSecond() {
        String data = "805.674\r\n23.4877\r\n1275.61\r\n872.997";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double expected = 399215.0;
        double actual = Double.parseDouble(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, Math.round(actual * 10) / 10.0);
    }

    @Test
    public void testMainThird() {
        String data = "750.94\r\n4.37945\r\n526.361\r\n772.386\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double expected = 172478.1;
        double actual = Double.parseDouble(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, Math.round(actual * 10) / 10.0);
    }

    @Test
    public void testMainForth() {
        String data = "174.574\r\n105.471\r\n1435.85\r\n245.245";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Main.main(null);
        double expected = 176293.6;
        double actual = Double.parseDouble(outContent.toString().replaceAll("[\\r\\n]", ""));

        assertEquals(expected, Math.round(actual * 10) / 10.0);
    }

}