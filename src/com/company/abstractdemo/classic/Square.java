package com.company.abstractdemo.classic;

public class Square {
    private String name;
    private String color;
    private Double side;

    public Square(String name, String color, Double side) {
        this.name = name;
        this.color = color;
        this.side = side;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double calculatePerimeter(){
        return 4* side;
    }

    public Double calculateSurface(){
        return side * side;
    }
}
