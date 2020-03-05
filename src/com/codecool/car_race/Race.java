package com.codecool.car_race;

import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;
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
            for(Vehicle vehicle : this.getVehicles()){
                if(vehicle instanceof Truck){
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0){
                        System.out.print(", Truck " + vehicle.getName() + " broken");
                        isBrokenTrack = true;
                    }
                }
                vehicle.prepareForLap(this);
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
