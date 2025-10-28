package com.pluralsight;

public class Hoverboard extends Vehicles{

    public Hoverboard(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void goesVroom(){
        System.out.println("Vroom");
    }
}
