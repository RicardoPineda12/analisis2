package service;


import lombok.Data;

@Data
public class FlyLikeRocket implements IFly{

    public FlyLikeRocket (){}

    @Override
    public void fly() {
        System.out.println("vuelo como un cohete");
    }
    @Override
    public String toString  () {
        return "FlyLikeRocket{}";
    }
}
