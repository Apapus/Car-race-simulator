package com.codecool.car_race;

import com.codecool.car_race.vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private boolean isThereABrokenTruck;
    private Weather weather;
    private List<Vehicle> vehicles;

    public Race() {
        this.weather = new Weather();
        vehicles = createVehicles();

    }

    public Weather getWeather() {
        return weather;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setThereABrokenTruck(boolean thereABrokenTruck) {
        isThereABrokenTruck = thereABrokenTruck;
    }

    private List<Vehicle> createVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
        return vehicles;
    }

    public boolean isThereABrokenTruck(){
        return isThereABrokenTruck;
    }

    public void startRace(){
        for(int i =1; i <= 50; i++){
            weather.setRaining();
            System.out.print("Lap: " + i + ", Rain: " + weather.isRaining());
            boolean isBrokenTrack = false;
            // make sure you only use Vehicle.moveForAnHour() in the simulation's for loop and you don't need to check the vehicles for the exact type
            for(Vehicle vehicle : this.getVehicles()){
                vehicle.prepareForLap(weather.isRaining(), isBrokenTrack);
                if(vehicle instanceof Truck){
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0){
                        System.out.print(", Truck " + vehicle.getName() + " broken");
                        isBrokenTrack = true;
                    }
                }
                vehicle.moveForAnHour();
            }
            this.setThereABrokenTruck(isBrokenTrack);
            System.out.println();
        }
    }

    public void printRaceResults(){
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + " : " + vehicle.getDistanceTraveled());
        }
    }

}
