package service;

import lombok.Data;

@Data
public class SquickSound implements ISound{

    public SquickSound (){}

    @Override
    public void makeSound (){
        System.out.println("squick");
    }
    @Override
    public String toString (){
        return "SquickSound{}";
    }
}
