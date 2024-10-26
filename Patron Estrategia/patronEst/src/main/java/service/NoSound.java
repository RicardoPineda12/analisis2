package service;

import lombok.Data;

@Data
public class NoSound implements ISound{
    public NoSound (){}

    @Override
    public void makeSound (){
        System.out.println("no hago sonido");
    }
    @Override
    public String toString (){
        return "NoSound{}";
    }
}
