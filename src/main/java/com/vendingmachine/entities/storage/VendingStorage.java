package com.vendingmachine.entities.storage;

import com.vendingmachine.entities.Item;
import com.vendingmachine.entities.enums.ProductType;

import java.util.ArrayList;
import java.util.List;

import static com.vendingmachine.entities.enums.ProductType.*;

public class VendingStorage {
    static List<Item> availableItems = new ArrayList<>();

    static{ //todo: acelasi lucru ca la bankStorage, adaugam toate produsele
        availableItems.add(new Item(apple, 1.5f, 10));
        //si pt celelalte
    }

    public void addNewProduct(Item item){
        availableItems.add(item);
    }

    public void addQuantityForExistingProduct(ProductType productType, Integer addedQuantity){
        availableItems.stream().filter(item -> item.getProductType() == productType).forEach(item -> item.setAvailableQuantity(item.getAvailableQuantity() + addedQuantity));
        //aici am folosit un stream, specific java 8, practic filtrez elementele listei ca sa le am doar pe cele care au type un egal cu cel primit ca parametru in functie,
        // si pentru fiecare voi adauga cantitatea primita la cea existenta(bineinteles va fi un singur element modificat)
    }
}
