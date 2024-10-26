public class Mocha extends Condiment {

    public Mocha(Beverage beverage) {
        super(beverage);  // Relación de asociación explícita
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
