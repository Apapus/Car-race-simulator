package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;

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
//        Race race = new Race();
//        createVehicles(race);
//
//        race.simulateRace();
//        race.printRaceResults();
    }
}
