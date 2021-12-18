package produktFamilie;

import produkt.dach.Dach;
import produkt.dach.Dachterrasse;
import produkt.rohbau.Betonbau;
import produkt.rohbau.Rohbau;

/**
 * Concrete Factory 2
 *  * Weiß, welche konkreten Produkte für diese Produktfamilie notwendig sind.
 *  * Oder anders gesagt:
 *  * Kennt die konkreten Aggregationen
 */
public class MehrfamilienhausFactory implements HausFactory {
    @Override
    public Rohbau errichteRohbau() {
        return new Betonbau();
    }

    @Override
    public Dach baueDach() {
        return new Dachterrasse();
    }
}
