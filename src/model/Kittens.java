package model;

import model.AnimalsGender;
import model.Cats;

public class Kittens extends Cats {
    public Kittens(int ages, String name){
        super(ages,name, AnimalsGender.FEMALE);
    }

}
