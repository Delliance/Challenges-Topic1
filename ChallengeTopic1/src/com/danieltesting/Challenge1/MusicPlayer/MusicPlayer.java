package com.danieltesting.Challenge1.MusicPlayer;

public class MusicPlayer {

    private Color color;
    private Memory memory;
    private BatteryLife batteryLife;

    public MusicPlayer(MusicPlayerFactory factory) {
        color = factory.setColor();
        memory = factory.setMemory();
        batteryLife = factory.setBatteryLife();
    }

    public void createMusicPlayer(){
        color.setColor();
        memory.setMemory();
        batteryLife.setBatteryLife();
    }

}
