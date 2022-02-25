package com.vendingmachine.application.interfaces;

import com.vendingmachine.entities.Item;

public interface VendingMachineActions {
    void depositMoney(); //aici in implementarea metodei de ex vei chema metoda din bankStoragede adaugare bani
    Item retrieveItem(); //ramane sa decizi cum vrei sa primesti suma de bani de la cumparator (cel mai simplu un float de ex 2.5 lei si il convertesti in bacnote si monede ca sa le adaugi in BankStorage ul automatului)
    //todo: alte metode care sunt operatii cu vending machine ul
}
