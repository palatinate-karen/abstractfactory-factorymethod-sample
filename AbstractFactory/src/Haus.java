import produkt.dach.Dach;
import produkt.rohbau.Rohbau;
import produktFamilie.EinfamilienhausFactory;
import produktFamilie.HausFactory;

public class Haus {

    private Rohbau rohbau;
    private Dach dach;

    public Haus() {
        HausFactory hausFactory = new EinfamilienhausFactory();
        rohbau = hausFactory.errichteRohbau();
        dach = hausFactory.baueDach();
    }
}
