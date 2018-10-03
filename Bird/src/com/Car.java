package com;

public class Car {

    String name;
    int model;

    public Car(String name,int model){
        this.name = name;
        this.model = model;
    }

    public void printsomething(){
        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
    }


}
