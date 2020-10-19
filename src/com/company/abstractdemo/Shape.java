package com.company.abstractdemo;

// Calcularea perimetrului, ariei pentru figuri geometrice
// Fiecare figura e caracterizata de nume, culoare
public abstract class Shape {
    private final String name;
    private String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public abstract Double calculatePerimeter();
    public abstract Double calculateSurface();
}
