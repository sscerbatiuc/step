package com.company.intrfaces;

public interface Interface {
   int x = 10;
   void run();
}


abstract class Shape {

    protected String name;
    protected String color;
    public abstract void getPerimeter();
}

class Circle extends Shape{
    public void getPerimeter() {
        System.out.println("Logica de calculare a perimetrului clasei Circle");
    }
}

class Square extends Shape {
    public void getPerimeter() {
        System.out.println("Logica de calculare a perimetrului clasei Square");
    }
}
