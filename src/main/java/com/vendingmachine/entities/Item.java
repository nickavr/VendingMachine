package com.vendingmachine.entities;

import com.vendingmachine.entities.enums.ProductType;

public class Item {
    private ProductType productType;
    private Float price;
    private Integer availableQuantity;

    public Item(ProductType productType, Float price, Integer availableQuantity) {
        this.productType = productType;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
