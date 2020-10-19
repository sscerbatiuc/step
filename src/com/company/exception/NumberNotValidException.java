package com.company.exception;

public class NumberNotValidException extends Exception {

    //"Exception: data specified from keyboard is not a number"
    public NumberNotValidException(){
        super("Exception: data specified from keyboard is not a number");
    }
}
