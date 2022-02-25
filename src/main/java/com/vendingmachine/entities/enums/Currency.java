package com.vendingmachine.entities.enums;

public enum Currency {
    ONE_LEU(1), FIVE_LEI(5), TEN_LEI(10), TEN_BANI(10), FIFTY_BANI(50);
    private Integer value;

    Currency(Integer value) {
        this.value = value;
    }

    public Float convertBaniToLei(Integer value){ //impartim la 100 ca sa avem rezultatul in lei
        return value/100f;
    }

}
