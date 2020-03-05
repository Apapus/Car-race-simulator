package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import java.util.Random;

public class Truck extends Vehicle {
//    private String name;
    private int breakdownTurnsLeft = 0; // holds how long its still broken down.

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

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    @Override
    public void prepareForLap(Race race) {
        Random r = new Random();
        if(r.nextInt(100) < 5){
           breakdownTurnsLeft = 2;
        }

        if(breakdownTurnsLeft <= 0){
            speed = normalSpeed;
        }else{
            speed = 0;
            breakdownTurnsLeft--;
        }
    }

//    @Override
//    public void moveForAnHour() {
//
//    }
//    private int distanceTraveled; // holds the summarized distance traveled in the race.

}
