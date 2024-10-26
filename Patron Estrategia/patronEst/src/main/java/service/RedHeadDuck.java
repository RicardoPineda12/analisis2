package service;

public class RedHeadDuck extends Duck{
    public RedHeadDuck (){
        sb = new QuackSound();
        fb = new FlyWithWings();
    }


    @Override
    public String toString () {
        return "RedHeadDuck{}";
    }
    public void display () {
        System.out.println("Hola soy un pato de cabeza roja");
    }


}
