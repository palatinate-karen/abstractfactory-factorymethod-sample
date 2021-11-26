import cocktail.Cocktail;
import cocktail.LongIslandIcedTea;
import cocktail.Mojito;

public class Aposto extends Bar {
    @Override
    public String bestellen() {
        return "LongIslandIcedTea";
    }

    // Factory Method
    @Override
    public Cocktail zubereiten(String name) {
        return switch (name.toLowerCase()) {
            case "longislandicedtea" -> new LongIslandIcedTea();
            case "mojito" -> new Mojito();
            default -> throw new IllegalArgumentException("kein solcher Cocktail");
        };
    }
}
