package com.danieltesting.Challenge1.MusicPlayer;

public class BatteryLife5 implements BatteryLife{

    public static int hoursBattery() {
        return 5;
    }

    @Override
    public void setBatteryLife() {
        System.out.println("Your music player has 5 hours of battery life");
    }
}
