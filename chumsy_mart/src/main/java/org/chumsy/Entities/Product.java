package org.chumsy.Entities;

import org.chumsy.Entities.Enum.CATEGORY;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    private CATEGORY category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }

    public Product(String productName, double price, int quantity, CATEGORY category) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}
