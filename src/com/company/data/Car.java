package com.company.data;

public class Car extends Vehicle {

    public Car(String name, String number) {
        super(name, number);
        System.out.println("Car created");
    }

    public void accelerate(){
        System.out.println("Car is accelerating!");
        this.run();
    }


    public void run2(){
        this.startEngine();
        System.out.println("Car is running");
    }
}
