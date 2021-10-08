package ru.list.real_pcy;

public class DoesNotContainsNumberException extends RuntimeException {
    public DoesNotContainsNumberException(){

    }

    public DoesNotContainsNumberException(String errorMessage){
        super(errorMessage);
    }
}