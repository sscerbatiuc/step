package com.company.enums;

import java.util.Scanner;

import static com.company.enums.DaysOfWeek.MONDAY;

public class Demo {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti ziua. Optiunile disponibile: ");
        for(DaysOfWeek day: DaysOfWeek.values()){
            System.out.print(day + " ");
        }
        String day = sc.nextLine();
        checkDay(day);
    }


    public static void checkDay(String day){ // 1
        //2
        DaysOfWeek dayOfWeek = DaysOfWeek.valueOf(day);
        System.out.println(MONDAY.toString());
        switch(dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Zi lucratoare");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

    }
}
