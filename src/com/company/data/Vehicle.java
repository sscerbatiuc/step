package com.company.data;

public class Vehicle {
    protected String name;
    protected String number;

    public Vehicle() {
        System.out.println("Vehicle default constructor");
    }

    public Vehicle(String name, String number){
        this.name = name;
        this.number = number;
    }

    public final void run(){
        this.startEngine();
        this.switchGear(1);
        /*...*/
    }

    public void startEngine(){
        System.out.println("Engine started....");
    }

    public void switchGear(int gear){
        System.out.println("Gear " + gear);
    }

    protected void stop() {

    }
}
