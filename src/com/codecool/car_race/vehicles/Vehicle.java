package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected String name;
    protected int distanceTraveled;

    public abstract void prepareForLap(Race race);
    public abstract void moveForAnHour();
}
