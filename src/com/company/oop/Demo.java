package com.company.oop;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Ion", "Mocanu");
        Person p2 = new Person("ion", "Mocanu");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("Hello"));

    }
}
