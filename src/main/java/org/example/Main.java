package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Course: Java programming language
        //Topic: Object-oriented programming.
        //Part two
        //  Task 1:
        //Create a Human class that will contain information about a person.
        //Using the imitation mechanism, implement the Builder class (contains information about
        //builder), the Sailor class (contains information about the sailor), the Pilot class (contains information about
        //pilot).
        //Each of the classes must contain the necessary methods for work.

        Human human1 = new Human("Alice", 25);
        Human human2 = new Human("Bob", 30);

        Builder builder1 = new Builder("Charlie", 35, "Carpenter");
        Builder builder2 = new Builder("Dave", 28, "Electrician");

        Sailor sailor1 = new Sailor("Eve", 40, "Ocean Voyager");
        Sailor sailor2 = new Sailor("Frank", 32, "Fishing Boat");

        Pilot pilot1 = new Pilot("Grace", 28, "Commercial Jet");
        Pilot pilot2 = new Pilot("Hank", 50, "Helicopter");

        System.out.println(human1.getName() + " is " + human1.getAge() + " years old.");
        System.out.println(builder1.getName() + " is a " + builder1.getConstructionSpecialty() + " builder.");
        System.out.println(sailor1.getName() + " sails on a ship called " + sailor1.getShipName() + ".");
        System.out.println(pilot1.getName() + " flies a " + pilot1.getAircraftType() + ".");

        //Task 3:
        //Program the Money class (class object operates with one currency) to work with money.
        //The classroom should have a field for storing a whole part of money (dollars, euros, hryvnias) and a field for
        //storage of pennies (cents, euro cents, pennies, etc.)
        //Implement methods for displaying the sum on the screen, given values for the parts.
        //Based on the Money class, create a Product class to work with a product or commodity. Implement a method that
        //allows you to reduce the price by a given number.
        //For each class, implement the necessary methods and fields.

        // Create instances of the Money class
        Money money1 = new Money(10, 50);  // $10.50
        Money money2 = new Money(5, 75);   // $5.75

        // Display the total amount
        System.out.println("Money 1: " + money1.getTotalAmount());
        System.out.println("Money 2: " + money2.getTotalAmount());

        // Reduce the price of Money 1 by $2.25
        money1.reducePrice(225);

        // Display the updated total amount
        System.out.println("Updated Money 1: " + money1.getTotalAmount());

        // Create an instance of the Product class
        Product product1 = new Product("Laptop", new Money(800, 0));

        // Display the product details
        System.out.println("Product 1: " + product1.getName() + ", Price: " + product1.getPrice().getTotalAmount());

        // Reduce the price of the product by $100
        product1.reducePrice(100);

        // Display the updated product details
        System.out.println("Updated Product 1: " + product1.getName() + ", Updated Price: " + product1.getPrice().getTotalAmount());

        //Task 5:
        //Create a base class “Musical Instrument” and derived classes “Violin”, “Trombone”, “Ukulele”,
        //"Cello". Using the constructor, set the name of each musical instrument and its
        //characteristics.
        //Implement methods for each of the classes:
        // Sound – emits the sound of a musical instrument (write text to the console)
        // Show – displays the name of the musical instrument
        // Desc – displays the description of the musical instrument
        // History - displays the history of the creation of a musical instrument

        // Create instances of each musical instrument
        Violin violin = new Violin("Violin");
        Cello cello = new Cello("Cello");

        // Demonstrate methods for each instrument
        violin.sound();
        violin.show();
        violin.desc();
        violin.history();

        System.out.println();

        cello.sound();
        cello.show();
        cello.desc();
        cello.history();
    }
}