import cocktail.Cocktail;
import cocktail.LongIslandIcedTea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarTest {
    /**
     * In der Bar Aposto wird ein Long Island bestellt.
     * Der Test prüft, dass dieser auch zurückgegeben wird.
     */
    @Test
    void getAlkoholgehalt() {
        Bar bar = new Aposto();
        Cocktail cocktail = bar.bestellen("LongIslandIcedTea");
        assertEquals(LongIslandIcedTea.class, cocktail.getClass());
        assertEquals("5,5%", cocktail.alkoholgehaltAusgeben());
    }
}