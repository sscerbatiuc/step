package com.company.abstractdemo;

public class Demo {

    public static void main(String[] args) {
        Square sq = new Square(4.5, "RED");
        Square sq2 = new Square(5.0, "BLUE");
        System.out.println(sq.getName());
        System.out.println(sq.calculatePerimeter());
        System.out.println(sq.calculateSurface());
    }
}
