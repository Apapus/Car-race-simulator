package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import java.util.Random;

public class Motorcycle extends Vehicle{
    private static int motorcycleNumber = 1; // The number of the instance. Used for its name.

    public Motorcycle() {
        super();
//        this.name = createName();
        this.normalSpeed = 100;
        this.limitedSpeed = this.normalSpeed - new Random().nextInt((50 - 5) + 1) + 5;
    }

    @Override
    protected String createName() {
        String motorcycleName = "Motorcycle " + motorcycleNumber;
        motorcycleNumber++;
        return motorcycleName;
    }

    @Override
    public void prepareForLap(boolean isRaining, boolean isBrokenTruck) {
        if(isRaining) {
            speed = limitedSpeed;
        }else{
            speed = normalSpeed;
        }
    }
}
