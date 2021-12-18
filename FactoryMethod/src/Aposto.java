import cocktail.Cocktail;
import cocktail.LongIslandIcedTea;
import cocktail.Mojito;

/**
 * ConcreteCreator
 */
public class Aposto extends Bar {
    /**
     * Factory Method
     */
    @Override
    public Cocktail bestellen(String name) {
        bestaetigen(name);

        return switch (name.toLowerCase()) {
            case "longislandicedtea" -> new LongIslandIcedTea();
            case "mojito" -> new Mojito();
            default -> throw new IllegalArgumentException("kein solcher Cocktail");
        };
    }
}
