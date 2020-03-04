package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import java.util.Random;

public class Motorcycle extends Vehicle {
    private static int motorcycleNumber = 1; // The number of the instance created. Used for its name.

    public Motorcycle() {
        this.name = "Motorcycle " + motorcycleNumber;
        motorcycleNumber++;
        Random r = new Random();
        this.normalSpeed = 100;
        this.limitedSpeed = this.normalSpeed - r.nextInt((50 - 5) + 1) + 5;
    }

    public String getName() {
        return name;
    }

    public int getNormalSpeed() {
        return this.normalSpeed;
    }

    public int getLimitedSpeed() {
        return this.limitedSpeed;
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {

    }
//    private String name; // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.

}
