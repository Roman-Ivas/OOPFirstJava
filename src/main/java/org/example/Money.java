package org.example;

public class Money {
    private int wholePart; // Dollars, euros, hryvnias, etc.
    private int pennies;   // Cents, euro cents, pennies, etc.

    public Money(int wholePart, int pennies) {
        this.wholePart = wholePart;
        this.pennies = pennies;
    }

    // Get the total amount as a string, e.g., "5 dollars and 50 cents".
    public String getTotalAmount() {
        return wholePart + " dollars and " + pennies + " cents";
    }

    // Reduce the price by a given amount.
    public void reducePrice(int reduction) {
        if (reduction >= 0) {
            if (pennies >= reduction) {
                pennies -= reduction;
            } else {
                int remainder = reduction - pennies;
                pennies = 100 - remainder % 100;
                wholePart -= remainder / 100;
            }
        }
    }
}
