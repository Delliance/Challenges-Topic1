package com.danieltesting.Challenge1.MusicPlayer;

public class ColorBlue implements Color{
    public static String colorName() {
        return "blue";
    }

    @Override
    public void setColor() {
        System.out.println("Your music player is color Blue");
    }
}
