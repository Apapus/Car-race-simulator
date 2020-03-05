package com.codecool.car_race;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        race.startRace();
        race.printRaceResults();
    }
}
