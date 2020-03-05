package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import java.util.Random;

public class Truck extends Vehicle {
//    private String name;
    private int breakdownTurnsLeft; // holds how long its still broken down.

    public Truck() {
        Random r = new Random();
        this.name = String.valueOf(r.nextInt(1000));
        this.normalSpeed = 100;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void prepareForLap(Race race) {
        speed = normalSpeed;
    }

//    @Override
//    public void moveForAnHour() {
//
//    }
//    private int distanceTraveled; // holds the summarized distance traveled in the race.

}
