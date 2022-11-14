package service.behavior;

import model.Cats;
import model.Dogs;
import service.ISound;

public class CatsBehaviors implements ISound {
    private Cats cats;
    public CatsBehaviors(){};
    public CatsBehaviors (Cats cats){
        this.cats =cats;
    }
    @Override
    public void bark() {
        System.out.println("Cats says: Meo meo!!!");
    }
}
