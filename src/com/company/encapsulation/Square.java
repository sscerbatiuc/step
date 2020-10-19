package com.company.encapsulation;

public class Square {
    private String name;
    private String color;
    private Double side;

    public Square(String color, Double side) {
        this.name = "Square";
        this.color = color;
        this.side = side;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if(name.equalsIgnoreCase("square")){
            this.name = name;
        }
    }



    public String getColor() {
        return color;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        if(side > 0){
            this.side = side;
        }
    }

    public Double calculatePerimeter(){
        return 4* side;
    }

    public Double calculateSurface(){
        return side * side;
    }
}
