package com.company.inheritance;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        String x = "Hello";
        Scanner sc = new Scanner(System.in);


        Animal cat2 = new Cat(); // [Animal    ] + cod Cat
        Object cat4 = new Cat();
        Animal cat3 = cat;
        cat2.eat();

        Animal dog2 = new Dog();




        dog2.eat();

        Animal[] arr = new Animal[2];
        arr[0] = cat2;
        arr[1] = dog2;

        for(Animal animal: arr){
            animal.eat();
        }

    }
}
