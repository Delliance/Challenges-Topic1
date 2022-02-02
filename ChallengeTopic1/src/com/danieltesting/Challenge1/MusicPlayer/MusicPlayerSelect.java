package com.danieltesting.Challenge1.MusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayerSelect {

    public static void chooseFeaturesMusicPlayer(String inputColor, int inputMemory, int inputBatteryLife){
        MusicPlayer musicPlayer = null;
        Color color = null;
        Memory memory = null;
        BatteryLife batteryLife = null;

        //these are the lists with the values in the classes, no touchy
        List<String> colorList = new ArrayList<String>();
        List<Integer> memoryList = new ArrayList<Integer>();
        List<Integer> batteryList = new ArrayList<Integer>();

        //Here add the colors
        colorList.add(ColorBlue.colorName().toLowerCase());
        colorList.add(ColorGreen.colorName().toLowerCase());

        //Here add the memories
        memoryList.add(Memory8.memoryGB());
        memoryList.add(Memory16.memoryGB());

        //Here add the batteries
        batteryList.add(BatteryLife5.hoursBattery());
        batteryList.add(BatteryLife8.hoursBattery());

        if (!colorList.contains(inputColor.toLowerCase())||!memoryList.contains(inputMemory)||!batteryList.contains(inputBatteryLife)){
            throw new IllegalStateException("Component not available");
        }

        switch (inputColor.toLowerCase()){
            case "green":
                color = new ColorGreen();
                break;
            case "blue":
                color = new ColorBlue();
                break;
        }

        switch (inputMemory){
            case 8:
                memory = new Memory8();
                break;
            case 16:
                memory = new Memory16();
                break;
        }

        switch (inputBatteryLife){
            case 5:
                batteryLife = new BatteryLife5();
                break;
            case 8:
                batteryLife = new BatteryLife8();
                break;
        }

        musicPlayer = new MusicPlayer(new MusicPlayerFactory(color,memory,batteryLife));

        musicPlayer.createMusicPlayer();
    }

}
