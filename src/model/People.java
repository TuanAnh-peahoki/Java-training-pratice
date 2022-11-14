package model;

public class People {
    private String name;
    public People(){}
    public People(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new NullPointerException("Name cannot be blank !!!");
        }else {
            this.name = name;
        }
    }
}
