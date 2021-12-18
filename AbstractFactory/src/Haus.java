import produkt.dach.Dach;
import produkt.rohbau.Rohbau;
import produktFamilie.EinfamilienhausFactory;
import produktFamilie.HausFactory;
import produktFamilie.MehrfamilienhausFactory;

/**
 * Definition eines Hauses.
 * Kennt lediglich die abstrakten Produkte und die abstrakte Factory.
 * Erhält Implementationen zurück, ohne sich je nach Hausart speziell darauf einstellen zu müssen.
 */
public class Haus {

    private final HausFactory hausFactory;

    private Rohbau rohbau;
    private Dach dach;

    public Haus(String type) {
        if (type.equals("Einfamilienhaus")) {
            hausFactory = new EinfamilienhausFactory();
        } else {
            hausFactory = new MehrfamilienhausFactory();
        }
    }

    public void buildHaus() {
        rohbau = hausFactory.errichteRohbau();
        dach = hausFactory.baueDach();
    }

    public Dach getDach() {
        return dach;
    }

    public Rohbau getRohbau() {
        return rohbau;
    }
}
