package service;

import model.Students;

import java.util.List;

public interface StudentServices {
    void printStudentList(List<Students> studentsList);
    void sortStudentListByGrade(List<Students>studentsList);
}
