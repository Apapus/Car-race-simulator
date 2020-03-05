package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;

import javax.sound.midi.Track;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.getName());
        System.out.println(car1.getNormalSpeed());
        System.out.println(car1.getLimitedSpeed());

        Motorcycle mot1 = new Motorcycle();
        System.out.println(mot1.getName());
        System.out.println(mot1.getNormalSpeed());
        System.out.println(mot1.getLimitedSpeed());

        Truck truck1 = new Truck();
        System.out.println(truck1.getName());
        System.out.println(truck1.getNormalSpeed());

        Race race = new Race();
//        createVehicles(race);
//
//        race.simulateRace();
//        race.printRaceResults();
    }
}
