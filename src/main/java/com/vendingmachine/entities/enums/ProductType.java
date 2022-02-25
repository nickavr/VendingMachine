package com.vendingmachine.entities.enums;

public enum ProductType {
    apple(0), chips(1), chocolate(2), soda(3), water(4);
    Integer code;

    ProductType(Integer code) {
        this.code = code;
    }
}
