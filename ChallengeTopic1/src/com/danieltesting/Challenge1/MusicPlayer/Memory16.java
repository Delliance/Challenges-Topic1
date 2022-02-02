package com.danieltesting.Challenge1.MusicPlayer;

public class Memory16 implements Memory{

    public static int memoryGB() {
        return 16;
    }

    @Override
    public void setMemory() {
        System.out.println("Your music player has 16 GB of memory");
    }
}
