package model;

public class Subjects {
    private String subjectName;
    private int numberOfLectures;
    private int numberOfPratices;

    public Subjects(){};
    public void setSubjectName(String subjectName) {
        if(subjectName.isEmpty()){
            throw new NullPointerException("Subject Name must be fill");
        }else {
            this.subjectName = subjectName;
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public int getNumberOfPratices() {
        return numberOfPratices;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        if(numberOfLectures <=0){
            throw new IllegalArgumentException("Number of Lectures must be larger than 0");
        }else {
            this.numberOfLectures = numberOfLectures;
        }
    }

    public void setNumberOfPratices(int numberOfPratices) {
        if(numberOfPratices <=0){
            throw new IllegalArgumentException("Number of Lectures must be larger than 0");
        }
        else {
            this.numberOfPratices = numberOfPratices;
        }
    }
}
