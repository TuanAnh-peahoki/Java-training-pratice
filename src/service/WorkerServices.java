package service;

import model.Students;
import model.Workers;

import java.util.List;

public interface WorkerServices {
   void printWorkersList(List<Workers> workersList);
   void sortWorkersListByMoney(List<Workers> workersList);
}
