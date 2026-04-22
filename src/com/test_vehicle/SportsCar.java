package com.test_vehicle;
class  SportsCar extends Vehicle implements Automobile {

    public SportsCar(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("SportsCar engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("SportsCar engine stopped.");
    }

    @Override
    void accelerate() {
        speed += 30;
        System.out.println("SportsCar accelerating fast! Speed: " + speed);
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("SportsCar stopped.");
    }

    @Override
    void gas() {
        System.out.println("SportsCar refueling...");
    }
}