public class Soy extends Condiment {

    public Soy(Beverage beverage) {
        super(beverage);  // Relación de asociación explícita
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
