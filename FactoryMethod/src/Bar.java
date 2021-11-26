import cocktail.Cocktail;

public abstract class Bar {
    public Cocktail cocktailVerkaufen() {
        String cocktailName = bestellen();
        return zubereiten(cocktailName);
    }
    public abstract String bestellen();
    // Factory Method
    public abstract Cocktail zubereiten(String name);
}
