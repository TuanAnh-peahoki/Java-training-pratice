package model;

public class Students extends People{
    private int classNumber;
    private int classIdentityID;

    public Students(){}
    public Students(int classIdentityID, int classNumber){
        super();
        this.classNumber = classNumber;
        this.classIdentityID = classIdentityID;
    }

    public int getClassIdentityID() {
        return classIdentityID;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassIdentityID(int classIdentityID) {
        if(classIdentityID <=0){
            throw new IllegalArgumentException(" Student Identity ID should start from 1 !!!");
        }
        else{
            this.classIdentityID = classIdentityID;
        }

    }

    public void setClassNumber(int classNumber) {
        if(classNumber <=0){
            throw new IllegalArgumentException(" Class number should start from 1 !!!");
        }
        else{
            this.classNumber = classNumber;
        }

    }
}
