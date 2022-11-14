package com.company.models;

import java.util.List;

public class CallHistory {
    private List<Call> callList;

    public CallHistory(List<Call> callList){
        this.callList = callList;
    }
    public List<Call> getCallList() {
        return callList;
    }

    public void setCallList(List<Call> callList) {
        if(callList.isEmpty()){
            throw new IllegalArgumentException("callList cannot be empty !!!!");
        }
        else{
            this.callList = callList;
        }
    }
}
