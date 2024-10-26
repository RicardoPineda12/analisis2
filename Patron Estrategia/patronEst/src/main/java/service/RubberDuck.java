package service;

public class RubberDuck extends Duck {
    public RubberDuck (){
        sb = new SquickSound();
        fb = new NoFly();
    }
    @Override
    public String toString() {
        return "RubberDuck{}";
    }
    @Override
    public void display () {
        System.out.println("Hola soy un pato de goma");
    }
}
