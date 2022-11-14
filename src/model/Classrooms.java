package model;

import java.util.List;
import java.util.Set;

public class Classrooms {
    private int classID;
    private List<Teachers> teachersList;
    private List<Students> studentsList;

    public Classrooms(){};
    public Classrooms(int classID, List<Students> studentsList, List<Teachers> teachersList){
        this.classID = classID;
        this.studentsList = studentsList;
        this.teachersList = teachersList;
    }

    public int getClassID() {
        return classID;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setClassID(int classID) {
        if(classID<0){
            throw new IllegalArgumentException("Class ID must be larger than 0 !!!");
        }else {
            this.classID = classID;
        }
    }

    public void setStudentsList(List<Students> studentsList) {
        if(studentsList.isEmpty()){
            throw new NullPointerException(" Student List must not be empty !!!");
        }else {
            this.studentsList = studentsList;
        }
    }

    public void setTeachersList(List<Teachers> teachersList) {
        if (teachersList.isEmpty()) {
            throw new NullPointerException("Teacher list must not be empty !!!");
        } else {
            this.teachersList = teachersList;
        }
    }
}
