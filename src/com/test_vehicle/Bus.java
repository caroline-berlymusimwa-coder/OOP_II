package com.test_vehicle;

class Bus extends Vehicle {

    public Bus(String brand) {
        super(brand);
    }

    @Override
    void accelerate() {
        speed += 10;
        System.out.println("Bus accelerating slowly. Speed: " + speed);
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("Bus stopped.");
    }

    @Override
    void gas() {
        System.out.println("Bus refueling...");
    }
}

