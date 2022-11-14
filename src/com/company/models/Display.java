package com.company.models;

public class Display {
    private float size;
    private String color;
    public Display(){}
    public Display(float size,String color){
        this.color = color;
        this.size = size;
    }
    public float getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "size: " +size+"-color: " +color;
    }
}
