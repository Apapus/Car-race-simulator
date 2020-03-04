package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public class Motorcycle extends Vehicle {
    private static int motorcycleNumber = 1; // The number of the instance created. Used for its name.
    private int speed = 100;

    public Motorcycle() {
        this.name = "Motorcycle " + motorcycleNumber;
        motorcycleNumber++;
    }

    public String getName() {
        return name;
    }

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {

    }
//    private String name; // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.

}
