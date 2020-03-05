package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import java.util.Random;

public class Car extends Vehicle {
    private final static String[] CARNAMES = {"Virtue", "Barrage", "Alabaster", "Moonlight", "Enigma", "Dynamo", "Celestial",
                                "Daydream", "Flow", "Tigress", "Wish", "Charm", "Reflect", "Portrait", "Vulture",
                                "Essence", "Capital", "Blaze", "Evolution", "Ferocity"};

    public Car() {
        Random r = new Random();
        this.name = CARNAMES[r.nextInt(19)] + " " + CARNAMES[r.nextInt(19)].toLowerCase();
        this.normalSpeed = r.nextInt((110 - 80) + 1) + 80;
        this.limitedSpeed = 75;
    }

    public String getName() {
        return name;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public int getLimitedSpeed() {
        return limitedSpeed;
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            this.speed = this.limitedSpeed;
        }else{
            this.speed = this.normalSpeed;
        }
    }

    @Override
    public void moveForAnHour() {

    }
//    private String name; // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
//    private int distanceTraveled; // holds the summarized distance traveled in the race.

}
