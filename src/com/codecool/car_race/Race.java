package com.codecool.car_race;

public class Race {
    private boolean isThereABrokenTruck;
    Weather weather;

    public Race() {
        this.weather = new Weather();
        System.out.println(weather.isRaining());
    }

    public void simulateRace(){
        for(int i = 0; i < 50; i++) {
//            moveForAnHour();
        }
    }

    public void printRaceResults(){
    }

    public boolean isThereABrokenTruck(){
        return isThereABrokenTruck;
    }
}
