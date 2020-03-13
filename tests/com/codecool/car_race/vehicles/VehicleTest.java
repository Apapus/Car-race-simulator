package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    Vehicle car = new Car();
    Vehicle motorcycle = new Motorcycle();
    Truck truck = new Truck();

    @Test
    public void carLimitedSpeed() throws Exception {
        assertEquals(75, car.limitedSpeed);
    }

    @Test
    public void motoLimitedSpeed() {
        assertTrue(motorcycle.limitedSpeed >=50 && motorcycle.limitedSpeed <=100);
    }

    @Test
    public void normalSpeed() throws Exception {
        assertTrue(car.normalSpeed > 80 && car.normalSpeed < 110);
    }

    @Test
    public void isTruckBroken() {
//        truck.prepareForLap(new Race());
        assertFalse(truck.getBreakdownTurnsLeft() > 0 && truck.getBreakdownTurnsLeft() <= 2);
    }

    @Test (expected = IllegalStateException.class)
    public void isTruckBrokenExeption() {
        truck.prepareForLap(new Race());
//        assertFalse(truck.getBreakdownTurnsLeft() > 0 && truck.getBreakdownTurnsLeft() <= 2);
    }
}