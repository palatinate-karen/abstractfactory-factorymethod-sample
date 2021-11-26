package produktFamilie;

import produkt.dach.Dach;
import produkt.dach.Dachterrasse;
import produkt.rohbau.Betonbau;
import produkt.rohbau.Rohbau;

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
