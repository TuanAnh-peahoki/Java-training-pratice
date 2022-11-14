package service.impl;

import model.Workers;
import service.WorkerServices;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkerServicesImpl implements WorkerServices {

    @Override
    public void printWorkersList(List<Workers> workersList) {
        for(Workers workers: workersList){
            System.out.println(workers.toString());
        }
    }

    @Override
    public void sortWorkersListByMoney(List<Workers> workersList) {
        Collections.sort(workersList, new Comparator<Workers>() {
            @Override
            public int compare(Workers o1, Workers o2) {
                return o1.getMoneyForHours() < o2.getMoneyForHours() ? 1 : -1;
            }
        });
    }
}
