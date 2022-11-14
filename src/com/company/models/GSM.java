package com.company.models;

public class GSM {
    private Battery battery;
    private Display display;
    private String phoneModel;
    private String manufacturer;
    private int price;
    private String owner;
    private CallHistory callHistory;
    public GSM(){}

    public GSM(String phoneModel, String manufacturer, int price,
               Battery battery, Display display,String owner){
        this.battery = battery;
        this.display = display;
        this.owner = owner;
        this.phoneModel = phoneModel;
        this.price = price;
        this.manufacturer = manufacturer;
        this.callHistory = null;
    }

    public GSM(String phoneModel, String manufacturer){
        this.battery = null;
        this.display = null;
        this.owner = null;
        this.phoneModel = phoneModel;
        this.price = 0;
        this.manufacturer = manufacturer;
        this.callHistory = null;
    }

    public GSM(String phoneModel, String manufacturer, int price,
               Battery battery, Display display,String owner,
                CallHistory callHistory){
        this.battery = battery;
        this.display = display;
        this.owner = owner;
        this.phoneModel = phoneModel;
        this.price = price;
        this.manufacturer = manufacturer;
        this.callHistory = callHistory;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public int getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public Battery getBattery() {
        return battery;
    }

    public CallHistory getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(CallHistory callHistory) {
        this.callHistory = callHistory;
    }

    @Override
    public String toString(){
        return "phoneModel: "+phoneModel + "-manufacturer: "+manufacturer+" -price: "+price+"-owner: "+owner+"-battery : "+battery+"- display : "+display;
    }
}
