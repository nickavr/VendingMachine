package com.vendingmachine.exceptions;

public class SoldOutException extends Exception{
    public SoldOutException() {
        super("Product is unavailable");
    }
}
