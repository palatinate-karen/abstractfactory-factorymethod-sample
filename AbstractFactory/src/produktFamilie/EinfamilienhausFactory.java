package produktFamilie;

import produkt.dach.Dach;
import produkt.dach.Giebeldach;
import produkt.rohbau.Holzbau;
import produkt.rohbau.Rohbau;

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
