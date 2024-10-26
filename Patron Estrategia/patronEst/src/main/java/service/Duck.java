package service;

import lombok.Data;
import lombok.Setter;

@Setter
public abstract class Duck {

    protected IFly fb;
    protected ISound sb;
    public Duck(){}
    public void swim (){
        System.out.println("Estoy nadando");
    }
    public void performFly (){
        fb.fly();
    }

    public void performSound (){
        sb.makeSound();
    }
    public abstract void display ();

    @Override
    public String toString () {
        return "Duck{}";
    }
}
