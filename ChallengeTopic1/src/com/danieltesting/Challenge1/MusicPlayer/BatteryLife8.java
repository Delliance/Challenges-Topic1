package com.danieltesting.Challenge1.MusicPlayer;

public class BatteryLife8 implements BatteryLife{

    public static int hoursBattery() {
        return 8;
    }

    @Override
    public void setBatteryLife() {
        System.out.println("Your music player has 8 hours of battery life");
    }
}
