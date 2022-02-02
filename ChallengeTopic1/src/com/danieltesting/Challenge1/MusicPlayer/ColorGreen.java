package com.danieltesting.Challenge1.MusicPlayer;

public class ColorGreen implements Color{

    public static String colorName() {
        return "green";
    }

    @Override
    public void setColor() {
        System.out.println("Your music player is color Green");
    }
}
