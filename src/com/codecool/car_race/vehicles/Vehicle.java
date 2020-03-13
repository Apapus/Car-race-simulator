package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected String name;
    protected int speed;
    protected int normalSpeed;
    protected int limitedSpeed;
    protected int distanceTraveled;

    // todo create constructor for all vehicles which will be inherited

    public String getName() {
        return name;
    }

    // todo create abstract generate name method for all vehicles DONE

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public abstract void prepareForLap(Race race);

    public void moveForAnHour(){
        distanceTraveled+= speed;
    }
}
