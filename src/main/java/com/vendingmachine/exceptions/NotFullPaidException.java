package com.vendingmachine.exceptions;

public class NotFullPaidException extends Exception{
    public NotFullPaidException() {
        super("Payment funds are insufficient");
    }
}
