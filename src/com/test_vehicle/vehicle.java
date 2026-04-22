package com.test_vehicle;
abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // Abstract methods
    abstract void accelerate();
    abstract void stop();
    abstract void gas();

    // Overloaded method (for later use)
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated by " + increment + " km/h. Speed: " + speed);
    }
}