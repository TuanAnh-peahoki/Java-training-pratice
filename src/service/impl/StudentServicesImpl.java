package service.impl;

import model.Students;
import model.Workers;
import service.StudentServices;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentServicesImpl implements StudentServices {

    @Override
    public void printStudentList(List<Students> studentsList) {
        for(Students students: studentsList){
            System.out.println(students.toString());
        }
    }

    @Override
    public void sortStudentListByGrade(List<Students> studentsList) {
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getGrade() > o2.getGrade() ? 1 : -1;
            }
        });
    }
}
