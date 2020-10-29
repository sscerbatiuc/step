package com.company.manager;

import java.time.LocalDate;

public class PupilsManager {

    public static int numberOfPupils = 10;

    private Elev[] array;
    // add, edit, delete, view - gresit

    public void add(Elev elev){
        this.array[0] = elev;
    }

    public void add(String name, String surname, LocalDate birthdate) {
        Elev elev = new Elev(name, surname, birthdate);
        this.array[0] = elev;
    }
}
