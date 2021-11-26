import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarTest {
    private Bar bar;

    @Test
    void getAlkoholgehalt() {
        bar = new Aposto();
        assertEquals("5,5%", bar.cocktailVerkaufen().alkoholgehaltAusgeben());
    }
}