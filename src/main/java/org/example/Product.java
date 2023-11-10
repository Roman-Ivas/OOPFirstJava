package org.example;

public class Product {
    private String name; // Name of the product.
    private Money price; // Price of the product.

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    // Get the product's name.
    public String getName() {
        return name;
    }

    // Get the product's price.
    public Money getPrice() {
        return price;
    }

    // Reduce the product's price by a given amount.
    public void reducePrice(int reduction) {
        price.reducePrice(reduction);
    }
}
