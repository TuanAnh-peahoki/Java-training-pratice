import model.Human;
import model.Students;
import model.Workers;
import service.MergeService;
import service.StudentServices;
import service.WorkerServices;
import service.impl.MergeServiceImpl;
import service.impl.StudentServicesImpl;
import service.impl.WorkerServicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Print students list");
        System.out.println("2.Print workers list");
        System.out.println("3.Sort students lists by grade in ascending order");
        System.out.println("4.Sort workers by money per hour in descending order");
        System.out.println("5.Merge students list with worker list");
        System.out.println("6.Sort mix list by First name");
        System.out.println("7.Sort mix list by Last name");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Bui","Khoi",9.6f));
        studentsList.add(new Students("Vo","Hoang",8.2f));
        studentsList.add( new Students("Ma","Minh",9.9f));
        studentsList.add(new Students("Ngoc","Long",2.1f));
        studentsList.add(new Students("Truong","An",5.4f));
        studentsList.add(new Students("To","Hoai",7.2f));
        studentsList.add(new Students("Minh","Phuc",3.8f));
        studentsList.add(new Students("Nguyen","Mai",10.0f));
        studentsList.add(new Students("Nhat","Tan",1.7f));
        studentsList.add(new Students("Phuc","Kien",5.1f));

        List<Workers> workersList = new ArrayList<Workers>();
        workersList.add(new Workers("Ma","Khai",400,30));
        workersList.add(new Workers("Tran","Thanh",342,10));
        workersList.add(new Workers("Truong","Giang",269,20));
        workersList.add(new Workers("Chi","Tai",689,50));
        workersList.add(new Workers("Dong","Nhi",501,40));
        workersList.add(new Workers("Hoang","Phuc",557,20));
        workersList.add(new Workers("Hoai","Anh",1000,10));
        workersList.add(new Workers("Duong","Khai",192,60));
        workersList.add(new Workers("Moc","Linh",785,50));
        workersList.add(new Workers("Tay","Chau",724,90));

        StudentServices studentServices = new StudentServicesImpl();
        WorkerServices workerServices = new WorkerServicesImpl();
        MergeService mergeService = new MergeServiceImpl();
        ArrayList<Human> mergeList = new ArrayList<Human>();
        while (true){
            menu();
            System.out.print("Nhap lua chon cua ban:");
            String select =  scanner.next();
            switch (select){
                case "1":
                    studentServices.printStudentList(studentsList);
                    break;
                case "2":
                    workerServices.printWorkersList(workersList);
                    break;
                case "3":
                    studentServices.sortStudentListByGrade(studentsList);
                    break;
                case "4":
                    workerServices.sortWorkersListByMoney(workersList);
                    break;
                case "5":
                    mergeList = (ArrayList<Human>)mergeService.mergeList(studentsList,workersList).clone();
                    break;
                case "6":
                    mergeService.sortMergeListByFirstName(mergeList);
                    break;
                case "7":
                    mergeService.sortMergeListByLastName(mergeList);
                    break;
                default:
                    System.out.println("Lua chon khong ton tai!!!");
                    break;
            }
        }
    }
}