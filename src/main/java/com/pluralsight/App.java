package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Moped mopedFeatures = new Moped("Red", 2, 20, 15);
        mopedFeatures.setColor("Red");
        mopedFeatures.setCargoCapacity(20);
        mopedFeatures.setFuelCapacity(15);
        mopedFeatures.setNumberOfPassengers(2);
        mopedFeatures.goesMeep();

        Car carFeatures = new Car("Blue", 4, 100, 50);
        carFeatures.setColor("Blue");
        carFeatures.setCargoCapacity(100);
        carFeatures.setFuelCapacity(50);
        carFeatures.setNumberOfPassengers(4);
        carFeatures.goesSkrrt();

        SemiTruck stFeatures = new SemiTruck("Grey", 3, 10000, 200);
        stFeatures.setColor("Grey");
        stFeatures.setCargoCapacity(10000);
        stFeatures.setFuelCapacity(200);
        stFeatures.setNumberOfPassengers(3);
        stFeatures.goesHonk();

        Hoverboard hbFeatures = new Hoverboard("Black", 1, 5, 5);
        hbFeatures.setColor("Black");
        hbFeatures.setCargoCapacity(5);
        hbFeatures.setFuelCapacity(5);
        hbFeatures.setNumberOfPassengers(1);
        hbFeatures.goesVroom();
    }
}
