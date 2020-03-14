package com.codecool.car_race.vehicles;

import java.util.Random;

public class Truck extends Vehicle{
    private int breakdownTurnsLeft = 0; // holds how long its still broken down.

    public Truck() {
        super();
//        this.name = createName();
        this.normalSpeed = 100;
    }

    @Override
    protected String createName() {
        return String.valueOf(new Random().nextInt(1000));
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    @Override
    public void prepareForLap(boolean isRaining, boolean isBrokenTruck) {
        if(new Random().nextInt(100) < 5){
           breakdownTurnsLeft = 2;
           speed = 0;
            return;
        }

        if(breakdownTurnsLeft == 0){
            speed = normalSpeed;
        }else if(breakdownTurnsLeft >0){
            speed = 0;
            breakdownTurnsLeft--;
        }
        //       throw new IllegalStateException(); // for test proposes only
    }
}
