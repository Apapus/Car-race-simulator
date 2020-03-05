package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Truck());
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
        Race race = new Race();
        for(int i =1; i <= 50; i++){
            for(Vehicle vehicle : race.getVehicles()){
                vehicle.prepareForLap(race);
                if(vehicle instanceof Truck){
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0){
                        System.out.println("Lap: " + i + " truck broken");
                        race.setThereABrokenTruck(true);
                    }else{
                        race.setThereABrokenTruck(false);
                    }
                }
                vehicle.moveForAnHour();
            }
        }
        System.out.println( race.getVehicles().get(0).getName() + " : " + race.getVehicles().get(0).getDistanceTraveled());
        System.out.println(race.getVehicles().get(1).getName() + " : " + race.getVehicles().get(1).getDistanceTraveled());
        System.out.println(race.getVehicles().get(2).getName() + " : " + race.getVehicles().get(2).getDistanceTraveled());
//        createVehicles(race);
//        Car car1 = new Car();
//        System.out.println(car1.getName());
//        System.out.println(car1.getSpeed());
//        System.out.println(car1.getLimitedSpeed());
//
//        Motorcycle mot1 = new Motorcycle();
//        System.out.println(mot1.getName());
//        System.out.println(mot1.getSpeed());
//        System.out.println(mot1.getLimitedSpeed());
//
//        Truck truck1 = new Truck();
//        System.out.println(truck1.getName());
//        System.out.println(truck1.getSpeed());

//        createVehicles(race);
//
        race.simulateRace();
//        race.printRaceResults();
    }
}
