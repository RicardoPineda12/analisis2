package service;

import lombok.Data;

@Data
public class FlyWithWings implements IFly{

    public FlyWithWings (){}

    @Override 
    public void fly() {
        System.out.println("vuelo");
    }
    @Override
    public String toString  () {
        return "FlyWithWings{}";
    }
}
