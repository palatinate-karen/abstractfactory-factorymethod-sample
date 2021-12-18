import org.junit.jupiter.api.Test;
import produkt.dach.Giebeldach;
import produkt.rohbau.Holzbau;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testet, dass bei einem Einfamilienhaus auch wirklich ein Giebeldach und Holzbau verwendet wurden.
 */
class HausTest {
    @Test
    void ichBaueEinEinfamilienhaus() {
        Haus haus = new Haus("Einfamilienhaus");

        haus.buildHaus();

        assertEquals(Giebeldach.class, haus.getDach().getClass());
        assertEquals(Holzbau.class, haus.getRohbau().getClass());
    }
}