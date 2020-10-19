package com.company.inheritance;

public class Cat extends Animal {

    public int x = 20;

    public void eat(){
        x= 45;
        System.out.println(x);
        System.out.println("Eats cat food");
    }

    public void meow(){

    }
}
