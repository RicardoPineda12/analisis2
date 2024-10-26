package service;

import lombok.Data;

@Data
public class NoFly implements IFly{

    public NoFly (){}

    @Override
    public void fly(){
        System.out.println("no vuelo");
    }
    @Override
    public String toString (){
        return "NoFly{}";
    }
}
