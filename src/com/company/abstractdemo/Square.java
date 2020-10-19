package com.company.abstractdemo;

public class Square extends Polygon {

    private Double side;

    public Square(Double side, String color){
        super("Square", color);
        this.side = side;
    }

    public Double calculatePerimeter(){
       return 4 * side;
    }

    public Double calculateSurface(){
        return side * side;
    }
}
