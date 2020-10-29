package com.company.manager;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        PupilsManager manager = new PupilsManager();
        System.out.println(PupilsManager.numberOfPupils);
        // Scanner,
        manager.add(new Elev("ion", "popescu", LocalDate.now()));
        manager.add("ion", "popescu", LocalDate.now());

        // array = [1,2,3,4,5]
        // array = ["string", "string"]
        // array = [new Elev(), new Elev()]
    }
}
