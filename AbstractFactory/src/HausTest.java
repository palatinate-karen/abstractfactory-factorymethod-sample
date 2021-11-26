import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HausTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    Haus haus;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void ichBaueEinEinfamilienhaus() {
        String expectedOutput = "Holz Giebeldach";

        haus = new Haus();

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}