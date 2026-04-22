package com.test_vehicle;

class Sedan extends Vehicle implements Automobile {

    public Sedan(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Sedan engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sedan engine stopped.");
    }

    @Override
    void accelerate() {
        speed += 15;
        System.out.println("Sedan accelerating. Speed: " + speed);
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("Sedan stopped.");
    }

    @Override
    void gas() {
        System.out.println("Sedan refueling...");
    }

    // Method Overloading
    void accelerate(double boost) {
        speed += boost;
        System.out.println("Sedan boosted! Speed: " + speed);
    }
}
