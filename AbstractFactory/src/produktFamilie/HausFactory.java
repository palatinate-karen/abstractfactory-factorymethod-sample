package produktFamilie;

import produkt.dach.Dach;
import produkt.rohbau.Rohbau;

/**
 * Abstract Factory
 */
public interface HausFactory {
    Rohbau errichteRohbau();
    Dach baueDach();
}
