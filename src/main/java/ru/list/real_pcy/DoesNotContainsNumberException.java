package ru.list.real_pcy;

public class DoesNotContainsNumberException extends Exception {
    public DoesNotContainsNumberException(){

    }

    public DoesNotContainsNumberException (String errorMessage){ {
            super(errorMessage);
        }
    }
}
