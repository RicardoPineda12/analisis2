package service;

public class ModelDuck extends Duck{
    public ModelDuck (){
        fb = new NoFly();
        sb = new NoSound();
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }
    @Override
    public void display (){
        System.out.println("Hola soy un pato de exhibición");

    }
}
