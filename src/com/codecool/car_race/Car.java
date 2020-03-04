package com.codecool.car_race;

public class Car {
    private int normalSpeed; // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    private String name; // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
    private int distanceTraveled; // holds the summarized distance traveled in the race.

    public void prepareForLap(Race race){} // setup the actual speed used for the current lap
    public void moveForAnHour(){} // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
}
