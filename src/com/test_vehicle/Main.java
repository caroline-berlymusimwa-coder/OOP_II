package com.test_vehicle;

public class Main {
    public static void main(String[] args) {

        Sedan mySedan = new Sedan("Toyota");

        // Interface methods
        mySedan.startEngine();

        // Overriding (from Vehicle)
        mySedan.accelerate();

        // Overloading
        mySedan.accelerate(25);
        mySedan.accelerate(10.5);

        mySedan.gas();
        mySedan.stop();
        mySedan.stopEngine();
    }
}
