package service;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        fb = new NoFly();
        sb = new NoSound();
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato señuelo");
    }
}
