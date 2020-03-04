package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public class Motorcycle extends Vehicle {
    private int speed = 100;
    private static int motorcycleNumber; // The number of the instance created. Used for its name.

    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {

    }
//    private String name; // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.

}
