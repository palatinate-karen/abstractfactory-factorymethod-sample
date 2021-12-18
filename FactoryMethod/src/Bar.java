import cocktail.Cocktail;

/**
 * Creator
 */
public abstract class Bar {
    /**
     * Factory Method
     */
    public abstract Cocktail bestellen(String name);

    public void bestaetigen(String name) {
        System.out.println("Es wurde " + name + " bestellt.");
        System.out.println("Cocktail wird zubereitet.");
    }

}
