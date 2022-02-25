package com.vendingmachine.entities.storage;

import com.vendingmachine.entities.Item;
import com.vendingmachine.entities.enums.Currency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vendingmachine.entities.enums.Currency.*; //aici avem un import static, ca sa nu mai scriem peste tot "Currency.ONE_LEU, etc." ci direct "ONE_LEU"

public class BankStorage {
    private static Map<Currency, Integer> moneyStorage = new HashMap<>(); //static ca sa l putem initializa in blockul de mai jos, care se executa inainte de creearea oricarui obiect

    static{
        moneyStorage.put(ONE_LEU, 10); //adaugam la map amountul din fiecare bancnota/moneda pe care automatul l ar avea initial
        moneyStorage.put(FIVE_LEI, 12);
        moneyStorage.put(TEN_LEI, 10);
        moneyStorage.put(TEN_BANI, 50);
        moneyStorage.put(FIFTY_BANI, 20);
    }

    public void addMoney(Map<Currency, Integer> receivedAmounts){ //facem refill la automat pe baza ideii tale, adaugam o cantitate anume din fiecare bancnota/moneda la cele deja existente
        //aici trebuie avut grija ca Map ul primit sa contina toate tipurile de Currency
        moneyStorage.put(ONE_LEU, moneyStorage.get(ONE_LEU) + receivedAmounts.get(ONE_LEU));
        //todo: fa la fel pentru restul bancnotelor/monedelor
    }

    public Map<Currency, Integer> genChange(Float amountToReturn) {
    //todo: aici facem un map cu fiecare banctota si cantitatea pe care trebuie sa o returneze automatul (aici ar trebui verificat si daca avem destui bani pt a da restul)
        //eu m am gandit ca parametrul functiei va fi o suma pe care noi trebuie sa o descompunem in bancnote si monede si sa o returnam. ex 10.5 lei -> 2 bancnote de 5 si o moneda de 50 de bani, restul vor fi 0 in Map.
        return null;
    }


}
