package model;

import java.util.List;

public class Animals {
    private int ages;
    private String names;

    private AnimalsGender sex;
    public Animals(){}
    public Animals(int ages, String names, AnimalsGender sex){
        this.ages = ages;
        this.names = names;
        this.sex = sex;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getAges() {
        return ages;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public AnimalsGender getSex() {
        return sex;
    }

    public void setSex(AnimalsGender sex) {
        this.sex = sex;
    }

    @Override
    public String toString(){
        return names+"-"+ages+"-"+sex;
    }

    public static float calculateAverageAge(List<?> animals){
        int tempSumAge = 0 ;
        List<Animals> animalsList = (List<Animals>) animals;
        for(Animals eachAnimals:animalsList){
            tempSumAge+=eachAnimals.getAges();
        }
        return (float) tempSumAge/animalsList.size();
    }
}
