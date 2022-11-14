package com.company;

import com.company.constants.BatteryTypes;
import com.company.models.*;
import com.company.services.CallingService;
import com.company.services.CallingServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GSM> gsmList = new ArrayList<GSM>();

        Battery LiIonbattery = new Battery("3A",12,85000, BatteryTypes.LIION);
        Battery NiMHbattery = new Battery("3AAA",6,899000, BatteryTypes.NiMH);
        Battery NiCdbattery = new Battery("4AA",30,129000, BatteryTypes.NiCd);

        Display displayIphone4S = new Display(20.06f,"red");
        Display displaySamsung10 = new Display(19.56f,"blue");

        GSM gsmIphone4S = new GSM("Iphone 4S","Apple",15,LiIonbattery,displayIphone4S,"Tuan");
        GSM gsmSamsung10 = new GSM("Samsung 10","Samsung",37,NiCdbattery,displaySamsung10,"Khoi");
        GSM gsmNokia = new GSM("Nokia","Nokia");

        gsmList.add(gsmIphone4S);
        gsmList.add(gsmSamsung10);
        gsmList.add(gsmNokia);
        /* Print to check auto assign null value and Override toString method*/
//        for (GSM gsm: gsmList){
//            System.out.println(gsm);
//        }
        /*-------------------------------------------- ADD method and DELETE and CLEAR method-------------------------------------------------------*/
        // Uncomment // o dong System.out.println de quan sat them
        //------------------------------------------------------ ADD METHOD ---------------------------------------------------
        Call call = new Call(new Date(), new Date(),"0291381231","34");
        Call call1 = new Call(new Date(), new Date(),"012939123","75");
        Call call2 = new Call(new Date(), new Date(),"054789375","21");
        List<Call> callList = new ArrayList<Call>();
        callList.add(call);
        callList.add(call1);
        callList.add(call2);

        Call newCall = new Call(new Date(), new Date(),"043492383","99");

        CallHistory callHistory = new CallHistory(callList);
        GSM gsmRealMe2 = new GSM("Real Me 2","Xiaomi",70,NiMHbattery,displayIphone4S,"Tuan",callHistory);
//          System.out.println("Before adding new call:");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }

        CallingService callingService = new CallingServiceImpl();
        callingService.addCall(gsmRealMe2,newCall);
//        System.out.println("After adding new call");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }
        //------------------------------------------------------ DELETE METHOD ---------------------------------------------------
//        System.out.println("Before deleting the chosen call:");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }
        Call deletedCall = new Call(new Date(), new Date(),"0291381231","34");
        callingService.deleteCall(gsmRealMe2,deletedCall);
//        System.out.println("After deleting the chosen call:");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }

        //------------------------------------------------------ CLEAR METHOD - Test Exception---------------------------------------------------
//        System.out.println("Before clearing the calling history:");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }
        // callingService.clearCallHistory(gsmRealMe2); // this will create exception as i have already set in CallHistory if you want to see clear method comment my exception
//        System.out.println("After clearing the calling history:");
//        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
//            System.out.println(calltest);
//        }
        /*-------------------------------------------- Calculate the total amount of money used for calling purpose------------------------------------------------------*/
        System.out.println("Total amount of money used for calling purpose: " +callingService.totalCallingPrice(gsmRealMe2) +"$");
        /*-------------------------------------------- Find the longest call and delete it from list------------------------------------------------------*/
        System.out.println("Before deleting the longest call:");
        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
            System.out.println(calltest);
        }
         callingService.removeLongestCall(gsmRealMe2); // this will create exception as i have already set in CallHistory if you want to see clear method comment my exception
        System.out.println("After deleting the longest call");
        for(Call calltest: gsmRealMe2.getCallHistory().getCallList()){
            System.out.println(calltest);
        }
    }
}
