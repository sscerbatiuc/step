package com.company.abstractdemo.classic;

public class Rectangle {

    private String name;
    private String color;
    private Double length;
    private Double height;

    public Rectangle(String name, String color, Double length, Double height) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }


    public Double calculatePerimeter(){
        return 2 * (length + height);
    }

    public Double calculateSurface(){
        return length * height;
    }
}
