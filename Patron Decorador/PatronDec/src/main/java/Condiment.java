public abstract class Condiment extends Beverage {
    protected Beverage beverage;  // Asociación con la clase Beverage

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
