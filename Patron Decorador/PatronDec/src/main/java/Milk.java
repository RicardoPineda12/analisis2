public class Milk extends Condiment {

    public Milk(Beverage beverage) {
        super(beverage);  // Relación de asociación explícita
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
