package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import java.util.Random;

public class Car extends Vehicle {
    private final static String[] CARNAMES = {"Virtue", "Barrage", "Alabaster", "Moonlight", "Enigma", "Dynamo", "Celestial",
                                "Daydream", "Flow", "Tigress", "Wish", "Charm", "Reflect", "Portrait", "Vulture",
                                "Essence", "Capital", "Blaze", "Evolution", "Ferocity"};

    public Car() {
        Random r = new Random();
        this.name = createCarName(r);
        this.normalSpeed = r.nextInt((110 - 80) + 1) + 80;
        this.limitedSpeed = 75;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public int getLimitedSpeed() {
        return limitedSpeed;
    }

    // generate car name and prevent equality of words in a name
    private String createCarName(Random r){
        String carName = "";
        String name1 = CARNAMES[r.nextInt(19)];
        String name2 = CARNAMES[r.nextInt(19)];
        if(!name1.equals(name2)){
            carName =  name1 + " " + name2.toLowerCase();
        }else{
            createCarName(r);
        }
        return carName;
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            this.speed = this.limitedSpeed;
        }else{
            this.speed = this.normalSpeed;
        }
    }

//    @Override
//    public void moveForAnHour() {
//        distanceTraveled+=speed;
//    }
//    private String name; // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
//    private int distanceTraveled; // holds the summarized distance traveled in the race.

}
