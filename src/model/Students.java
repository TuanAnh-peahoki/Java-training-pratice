package model;

public class Students extends Human {
    private float grade;
    public Students(String firstName, String lastName,float grade) {
        super(firstName, lastName);
        this.grade=grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " " + grade;
    }
}
