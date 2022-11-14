package com.company.models;

import com.company.constants.BatteryTypes;

public class Battery {
    private String batteryModel;
    private float batteryWorkingHours;
    private int batteryLife;
    private BatteryTypes batteryTypes;

    public Battery(){}

    public Battery(String batteryModel, float batteryWorkingHours,
                   int batteryLife, BatteryTypes batteryTypes){
        this.batteryLife = batteryLife;
        this.batteryModel = batteryModel;
        this.batteryWorkingHours = batteryWorkingHours;
        this.batteryTypes =  batteryTypes;
    }

    public BatteryTypes getBatteryTypes() {
        return batteryTypes;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public float getBatteryWorkingHours() {
        return batteryWorkingHours;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public void setBatteryTypes(BatteryTypes batteryTypes) {
        this.batteryTypes = batteryTypes;
    }

    public void setBatteryWorkingHours(float batteryWorkingHours) {
        this.batteryWorkingHours = batteryWorkingHours;
    }

    @Override
    public String toString(){
        return "battery Model: " + batteryModel +"- battery hours: "+ batteryWorkingHours + "- battery life: " + batteryLife +" -battery Type:" + batteryTypes;
    }
}
