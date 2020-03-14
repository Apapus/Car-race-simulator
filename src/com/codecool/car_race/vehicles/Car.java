package com.codecool.car_race.vehicles;
import java.util.Random;

public class Car extends Vehicle {
    private final static String[] CARNAMES = {"Virtue", "Barrage", "Alabaster", "Moonlight", "Enigma", "Dynamo", "Celestial",
                                "Daydream", "Flow", "Tigress", "Wish", "Charm", "Reflect", "Portrait", "Vulture",
                                "Essence", "Capital", "Blaze", "Evolution", "Ferocity"};
    private final int MAX_NORMAL_SPEED = 110;
    private final int MIN_NORMAL_SPEED = 80;
// todo move to constructor in upper class


    public Car() {
        super();
//        this.name = name;
        // nit remove magic numbers DONE
        this.normalSpeed = new Random().nextInt((MAX_NORMAL_SPEED - MIN_NORMAL_SPEED) + 1) + MIN_NORMAL_SPEED;
        this.limitedSpeed = 75;
    }

    @Override
    protected String createName() {
        Random r = new Random();
        String carName = "";
        // nit remove magic numbers DONE
        String name1 = CARNAMES[r.nextInt(CARNAMES.length)];
        String name2 = CARNAMES[r.nextInt(CARNAMES.length)];
        if(!name1.equals(name2)){
            carName =  name1 + " " + name2.toLowerCase();
        }else{
            // todo think about it!
            return createName();
        }
        return carName;
    }

    // generate car name and prevent equality of words in a name
//    private String createCarName(Random r){
//        String carName = "";
//        // nit remove magic numbers DONE
//        String name1 = CARNAMES[r.nextInt(CARNAMES.length)];
//        String name2 = CARNAMES[r.nextInt(CARNAMES.length)];
//        if(!name1.equals(name2)){
//            carName =  name1 + " " + name2.toLowerCase();
//        }else{
//            // todo think about it!
//            return createCarName(r);
//        }
//
//        return carName;
//    }

    @Override
    public void prepareForLap(boolean isRaining, boolean isBrokenTruck) {
        if(isBrokenTruck) {
            this.speed = this.limitedSpeed;
        }else{
            this.speed = this.normalSpeed;
        }
    }
}
