package service;

import model.Human;
import model.Students;
import model.Workers;

import java.util.ArrayList;
import java.util.List;

public interface MergeService {
    ArrayList<Human> mergeList(List<Students> studentsList, List<Workers> workersList);
    void sortMergeListByFirstName(ArrayList<Human> mergeList);
    void sortMergeListByLastName(ArrayList<Human> mergeList);
}
