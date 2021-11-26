package produktFamilie;

import produkt.dach.Dach;
import produkt.rohbau.Rohbau;

public interface HausFactory {
    Rohbau errichteRohbau();
    Dach baueDach();
}
