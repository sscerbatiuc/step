package com.company.calculator;

public class App {
    public static void main(String[] args){
        Algebra algebra = new Algebra();
        double sum = algebra.sum(1.0, 2.5);
        System.out.println(sum);
        Geometry geom = new Geometry();
        double geoSum = geom.sum(1.0, 2.5);
        System.out.println(geoSum);
    }
}
