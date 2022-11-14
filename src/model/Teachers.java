package model;

import java.util.List;

public class Teachers extends People{
    private List<Subjects> subjectsList;
    public Teachers(){}
    public Teachers(List<Subjects> subjectsList){
        super();
        this.subjectsList = subjectsList;
    }
    public List<Subjects> getSubjects() {
        return subjectsList;
    }

    public void setSubjects(List<Subjects> subjectsList) {
        if(subjectsList.isEmpty()){
            throw new NullPointerException("List of Subjects cannot be empty !!!");
        }
        else{
            this.subjectsList = subjectsList;
        }
    }
}
