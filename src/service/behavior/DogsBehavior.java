package service.behavior;

import model.Dogs;
import model.Frogs;
import service.ISound;

public class DogsBehavior implements ISound {
    private Dogs dogs;

    public DogsBehavior(Dogs dogs){
        this.dogs = dogs;
    }
    public DogsBehavior(){}
    @Override
    public void bark() {
        System.out.println("Dogs says: Gau gau !!!");
    }
}
