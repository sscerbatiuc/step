package com.company.encapsulation;

public class NoEncapsulation {
    public static void main(String[] args) {
        Square sq = new Square("RED", 55.5);
        sq.setName("Rectangle");

        System.out.println(sq.getName());
    }
}
