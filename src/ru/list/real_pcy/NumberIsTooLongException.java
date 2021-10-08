package ru.list.real_pcy;

public class NumberIsTooLongException extends Exception {
    public NumberIsTooLongException(){

    }

    public NumberIsTooLongException(String errorMessage){
        super(errorMessage);
    }
}