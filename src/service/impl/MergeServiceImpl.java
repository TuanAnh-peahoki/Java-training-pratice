package service.impl;

import model.Human;
import model.Students;
import model.Workers;
import service.MergeService;

import java.util.*;

public class MergeServiceImpl implements MergeService {
    @Override
    public ArrayList<Human> mergeList(List<Students> studentsList, List<Workers> workersList) {
        ArrayList<Human> mergeList = new ArrayList<>();
        Iterator tempStudent = studentsList.listIterator();
        while(tempStudent.hasNext()){
            mergeList.add((Human) tempStudent.next());
        }
        Iterator tempWorker = workersList.listIterator();
        while (tempWorker.hasNext()){
            mergeList.add((Human) tempWorker.next());
        }
        for(Object object:mergeList){
            if(object instanceof Students){
                Students students = (Students) object;
                System.out.println(students.toString());
            }
            else if(object instanceof Workers){
                Workers workers = (Workers) object;
                System.out.println(workers.toString());
            }
        }
        return mergeList;
    }

    @Override
    public void sortMergeListByFirstName(ArrayList<Human> mergeList) {
        Collections.sort(mergeList, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        for(Object object:mergeList){
            if(object instanceof Students){
                Students students = (Students) object;
                System.out.println(students.toString());
            }
            else if(object instanceof Workers){
                Workers workers = (Workers) object;
                System.out.println(workers.toString());
            }
        }
    }

    @Override
    public void sortMergeListByLastName(ArrayList<Human> mergeList) {
        Collections.sort(mergeList, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for(Object object:mergeList){
            if(object instanceof Students){
                Students students = (Students) object;
                System.out.println(students.toString());
            }
            else if(object instanceof Workers){
                Workers workers = (Workers) object;
                System.out.println(workers.toString());
            }
        }
    }
}
