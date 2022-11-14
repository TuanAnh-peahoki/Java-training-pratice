package com.company.services;

import com.company.models.Call;
import com.company.models.CallHistory;
import com.company.models.GSM;

import java.util.List;

public interface CallingService {
    void addCall(GSM gsm, Call newCall);
    void deleteCall(GSM gsm, Call deleteCall);
    void clearCallHistory(GSM gsm);
    float totalCallingPrice(GSM gsm);
    void removeLongestCall(GSM gsm);
}
