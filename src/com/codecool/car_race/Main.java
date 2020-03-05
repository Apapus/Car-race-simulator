package com.codecool.car_race;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        for(int i =1; i <= 50; i++){
            for(Vehicle vehicle : race.getVehicles()){
                if(vehicle instanceof Truck){
                    if (((Truck) vehicle).getBreakdownTurnsLeft() > 0){
                        System.out.println("Lap: " + i + " truck " + vehicle.getName() + " broken");
                        race.setThereABrokenTruck(true);
                    }else{
                        race.setThereABrokenTruck(false);
                    }
                }
                vehicle.prepareForLap(race);
                vehicle.moveForAnHour();
            }
        }
        race.printRaceResults();
    }
}
