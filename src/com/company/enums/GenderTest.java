package com.company.enums;

import java.util.Scanner;

public class GenderTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti genul");
        String gender = sc.nextLine();
        try {
            Gender entered = Gender.valueOf(gender);
            System.out.println(entered.getPensionAge());
        } catch (Exception e) {
            System.out.println("Wrong gender");
        }
    }
}
