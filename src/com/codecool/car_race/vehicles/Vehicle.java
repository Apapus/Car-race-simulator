package com.codecool.car_race.vehicles;

public abstract class Vehicle {
    protected String name;
    protected int speed;
    protected int normalSpeed;
    protected int limitedSpeed;
    protected int distanceTraveled;

    // todo create constructor for all vehicles which will be inherited DONE
    public Vehicle() {
        this.name = createName();
    }

    // Add abstract method
    protected abstract String createName();

    public String getName() {
        return name;
    }

    // todo create abstract generate name method for all vehicles DONE

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    // for truck
    public abstract void prepareForLap(boolean isRaining, boolean isBrokenTruck);

    public void moveForAnHour(){
        distanceTraveled+= speed;
    }
}
