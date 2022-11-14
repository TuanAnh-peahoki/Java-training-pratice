import model.*;
import service.behavior.CatsBehaviors;
import service.behavior.DogsBehavior;
import service.behavior.FrogsBehaviors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       DogsBehavior dogsBehavior = new DogsBehavior();
       CatsBehaviors catsBehaviors = new CatsBehaviors();
       FrogsBehaviors frogsBehaviors  = new FrogsBehaviors();
       List<Tomcat> tomcatsList = new ArrayList<Tomcat>();
       tomcatsList.add(new Tomcat(12,"Mike"));
       tomcatsList.add(new Tomcat(11,"Kitty"));
       tomcatsList.add(new Tomcat(12,"Trevor"));

       List<Kittens> kittensList = new ArrayList<Kittens>();
       kittensList.add(new Kittens(20,"Kittens"));
       kittensList.add(new Kittens(40,"Lara"));

       List<Dogs> dogsList = new ArrayList<Dogs>();
       dogsList.add(new Dogs(3,"Sharo", AnimalsGender.FEMALE));
       dogsList.add(new Dogs(4,"Mike",AnimalsGender.MALE));
       dogsList.add(new Dogs(7,"Sheriff",AnimalsGender.MALE));

       List<Frogs> frogsList = new ArrayList<Frogs>();
       frogsList.add(new Frogs(13,"model.Frogs",AnimalsGender.MALE));
       frogsList.add(new Frogs(12,"Charlie",AnimalsGender.FEMALE));

       List<Cats> catsList = new ArrayList<Cats>();
       catsList.add(new Cats(40,"model.Cats",AnimalsGender.FEMALE));
       catsList.add(new Cats(12,"Larriel",AnimalsGender.FEMALE));
       catsList.add(new Cats(58,"Oggy",AnimalsGender.FEMALE));
       catsList.add(new Cats(11,"Jack",AnimalsGender.MALE));


       float dogAverageAge = Animals.calculateAverageAge(dogsList);
       float frogAverageAge = Animals.calculateAverageAge(frogsList);
       float tomcatAverageAge = Animals.calculateAverageAge(tomcatsList);
       float kittensAverageAge = Animals.calculateAverageAge(kittensList);
       float catsAverageAge = Animals.calculateAverageAge(catsList);

       System.out.println("Dog average Age is:"+dogAverageAge);
       System.out.println("Frog average Age is:"+frogAverageAge);
       System.out.println("Tomcat average Age is:"+tomcatAverageAge);
       System.out.println("Kittens average Age is:"+kittensAverageAge);
       System.out.println("Cats average Age is:"+catsAverageAge);

       dogsBehavior.bark();
       catsBehaviors.bark();
       frogsBehaviors.bark();
    }
}