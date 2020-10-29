package com.company.oop;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person("Ion");
        p.setName("Ion");
        System.out.println(p.getName());

        Person[] pers = new Person[10];
        pers[0].setName("Petru");

    }
}
