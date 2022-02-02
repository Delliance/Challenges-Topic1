package com.danieltesting.Challenge1.MusicPlayer;

public class MusicPlayerFactory {

    private static Color color;
    private static Memory memory;
    private static BatteryLife batteryLife;

    public MusicPlayerFactory(Color color,Memory memory,BatteryLife batteryLife) {

        this.color = color;
        this.memory = memory;
        this.batteryLife = batteryLife;

    }
    public static Color setColor() {
        return color;
    }

    public static Memory setMemory() {
        return memory;
    }

    public static BatteryLife setBatteryLife() {
        return batteryLife;
    }

}
