package com.danieltesting.Challenge1.MusicPlayer;

public class Memory8 implements Memory{

    public static int memoryGB() {
        return 8;
    }

    @Override
    public void setMemory() {
        System.out.println("Your music player has 8 GB of memory");
    }
}
