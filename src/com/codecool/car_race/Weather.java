package com.codecool.car_race;

import java.util.Random;

public class Weather {
    private boolean isRain;

    public Weather() {
        setRaining();
    }

    public void setRaining(){// 30% chance of rain.
        Random r = new Random();
        isRain = r.nextInt(100) <= 30;
    }

    public boolean isRaining(){// is it raining currently.
        return isRain;
    }
}
