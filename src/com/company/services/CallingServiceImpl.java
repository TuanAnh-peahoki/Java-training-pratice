package com.company.services;

import com.company.models.Call;
import com.company.models.CallHistory;
import com.company.models.GSM;

import java.util.ArrayList;
import java.util.List;

public class CallingServiceImpl implements CallingService {
    private final float callPrice = 0.37f;

    @Override
    public void addCall(GSM gsm, Call newCall) {
        CallHistory callHistory = gsm.getCallHistory();
        List<Call> callList = callHistory.getCallList();
        callList.add(newCall);
        callHistory.setCallList(callList);
        gsm.setCallHistory(callHistory);
    }

    @Override
    public void deleteCall(GSM gsm, Call deleteCall) {
        CallHistory callHistory = gsm.getCallHistory();
        List<Call> callList = callHistory.getCallList();
        for(Call call: callList){
            if(call.getPhoneNumber().equals(deleteCall.getPhoneNumber())){
                callList.remove(call);
                break;
            }
        }
        callHistory.setCallList(callList);
        gsm.setCallHistory(callHistory);
    }

    @Override
    public void clearCallHistory(GSM gsm) {
        List<Call> blankCallList = new ArrayList<Call>();
        gsm.getCallHistory().setCallList(blankCallList);
    }

    @Override
    public float totalCallingPrice(GSM gsm){
        float tempTotal = 0.0f;
        List<Call> callList = gsm.getCallHistory().getCallList();
        for(Call call:callList){
            tempTotal += Integer.parseInt(call.getDuration())*callPrice;
        }
        return  tempTotal;
    }

    @Override
    public void removeLongestCall(GSM gsm) {
        List<Call> callList = gsm.getCallHistory().getCallList();
        int longestCallPoisition = 0;
        int longestCall = Integer.parseInt(callList.get(0).getDuration());
        for(Call call:callList){
            if(longestCall<Integer.parseInt(call.getDuration())){
                longestCallPoisition = callList.indexOf(call);
            }
        }
        callList.remove(longestCallPoisition);
    }
}
