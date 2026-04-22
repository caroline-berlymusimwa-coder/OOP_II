package com.test_vehicle;

class Motorcycle extends Vehicle {

    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void accelerate() {
        speed += 20;
        System.out.println("Motorcycle accelerating. Speed: " + speed);
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("Motorcycle stopped.");
    }

    @Override
    void gas() {
        System.out.println("Motorcycle refueling...");
    }
}
