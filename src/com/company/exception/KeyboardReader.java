package com.company.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class KeyboardReader {

    // 1. Introduca un numar pana cand nu introduce un numar corect
    Scanner scanner = new Scanner(System.in);


    public void enterNumberUntilValid(){
        boolean isValid = false;
        do {
            try{
                int x = enterNumber();
                isValid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again");
            }
        } while(!isValid);
        System.out.println("Bye!");
    }


    public int enterNumber() throws NumberNotValidException {
        int val;

        // FileReader, Connection
        try {
            System.out.println("Please enter a number");
            val = scanner.nextInt();
            return val;
        } catch (InputMismatchException ex) {
            scanner.nextLine();
            System.out.println("Data is not a number");
            throw new NumberNotValidException();
        } finally {
            System.out.println("print");
            // fileReader.close()
        }


    }


}
