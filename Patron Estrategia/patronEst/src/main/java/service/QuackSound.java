package service;

import lombok.Data;

@Data
public class QuackSound implements ISound {

    public QuackSound (){}

    @Override
    public void makeSound (){
        System.out.println("quack");
    }

    @Override
    public String toString (){
        return "QuackSound{}";
    }


}
