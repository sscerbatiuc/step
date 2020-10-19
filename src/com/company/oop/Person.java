package com.company.oop;

public class Person {

    String name;      // "ion"          "Ion"
    String surname;   // "Mocanu"       "Mocanu"
    String fatherName;
    String birthdate;
    char gender;
    Character genderWrapper;
    int age;
    Integer ageWrapper;

    // Create Read Update Delete
    // Facebook - posts, photo, friends
    // EmployeeManager



//    String idnp;
    String birthplace;
    String citizenship;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean equals(Object object) {
        // logica de comparare
        // comparam adresa?
        if(this == object) return true;
        //// daca adresele sunt egale - acelasi obiect (true)
        // daca adresele nu sunt egale? - cautam mai departe
        // verificam daca tipurile obiectelor sunt egale?
        boolean sameClass = this.getClass().equals(object.getClass());
        boolean sameClass2 = object instanceof Person;
        //// daca ele sunt de tip diferit - false
        if(!sameClass2) return false;

        // daca ele sunt de acelasi tip
        // name, surname, gen, birthdate
        Person p = (Person) object;
        return name.equalsIgnoreCase(p.name)
                && surname.equalsIgnoreCase(p.surname)
                && gender == p.gender;
    }


}
