package com.codecool.car_race;

public class Motorcycle {
    private int speed = 100;
    private static int motorcycleNumber; // The number of the instance created. Used for its name.
    private String name; // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
    private int distanceTraveled; // holds the summarized distance traveled in the race.

    public void prepareForLap(Race race){} // setup the actual speed used for the current lap
    public void moveForAnHour(){} // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
}
