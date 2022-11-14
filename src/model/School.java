package model;

import java.util.List;

public class School {
    private List<Classrooms> classrooms;

    public School(){};

    public School(List<Classrooms> classrooms){
        this.classrooms = classrooms;
    }

    public List<Classrooms> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classrooms> classrooms) {
        if(classrooms.isEmpty()){
            throw new NullPointerException("Classroom list can not be empty !!!");
        }
        else{
            this.classrooms = classrooms;
        }
    }
}
