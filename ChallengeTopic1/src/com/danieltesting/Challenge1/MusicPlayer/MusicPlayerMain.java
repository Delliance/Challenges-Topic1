package com.danieltesting.Challenge1.MusicPlayer;

import java.util.Scanner;

public class MusicPlayerMain {

    public static void abstractFactoryMain() {

        String userColor = "";
        int userMemory = 0;
        int userBattery = 0;
        Scanner newScanner = new Scanner(System.in);

        try {
            System.out.println("""
                Welcome to Daniel's music player shop please
                select how to you want your device:
                
                Color (Blue/Green):""");
            userColor = newScanner.nextLine();
            System.out.println("Memory size in GB (8/16):");
            userMemory = Integer.parseInt(newScanner.nextLine());
            System.out.println("Battery Life in hours (5/8):");
            userBattery = Integer.parseInt(newScanner.nextLine());
            MusicPlayerSelect.chooseFeaturesMusicPlayer(userColor, userMemory, userBattery);
        }
        catch (Exception ohNo){
            System.out.println("Not a valid product, try again");
        }
    }

}
