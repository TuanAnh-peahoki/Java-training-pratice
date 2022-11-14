package service.behavior;

import model.Frogs;
import service.ISound;

public class FrogsBehaviors implements ISound {
    private Frogs frogs;

    public FrogsBehaviors(Frogs frogs){
        this.frogs = frogs;
    }
    public FrogsBehaviors(){}


    @Override
    public void bark() {
        System.out.println("Frogs says Op op !!!");
    }
}
