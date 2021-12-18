package produktFamilie;

import produkt.dach.Dach;
import produkt.dach.Giebeldach;
import produkt.rohbau.Holzbau;
import produkt.rohbau.Rohbau;

/**
 * Concrete Factory 1
 * Weiß, welche konkreten Produkte für diese Produktfamilie notwendig sind.
 * Oder anders gesagt:
 * Kennt die konkreten Aggregationen
 */
public class EinfamilienhausFactory implements HausFactory {
    @Override
    public Rohbau errichteRohbau() {
        return new Holzbau();
    }

    @Override
    public Dach baueDach() {
        return new Giebeldach();
    }
}
