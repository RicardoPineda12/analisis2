package service;

public class MallardDuck extends Duck {

    public MallardDuck (){
        fb = new FlyWithWings();
        sb = new QuackSound();
    }

   @Override
   public String toString() {
       return "MallardDuck{}";
    }
   @Override
    public void display (){
       System.out.println("Hola soy un pato silvestre");

    }

}
