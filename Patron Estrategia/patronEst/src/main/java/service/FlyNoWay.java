package service;

public class FlyNoWay implements IFly {
    public FlyNoWay (){}

    @Override
    public void fly() {
        System.out.println("no puedo volar");
    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
