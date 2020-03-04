package com.codecool.car_race;

public class Truck {
    private int speed = 100;
    private String name;
    private int breakdownTurnsLeft; // holds how long its still broken down.
    private int distanceTraveled; // holds the summarized distance traveled in the race.

    public void prepareForLap(Race race){} // setup the actual speed used for the current lap
    public void moveForAnHour(){} // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
}
