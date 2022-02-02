package com.danieltesting.Challenge1;

import com.danieltesting.Challenge1.HotDog.HotDogMain;
import com.danieltesting.Challenge1.MusicPlayer.MusicPlayerMain;
import com.danieltesting.Challenge1.OnlineShop.OnlineShopMain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner exampleOption = new Scanner(System.in);
        String selectedExample = "";

        System.out.println("What example do you want to run?" +
                "\nMusic Player (M)" +
                "\nOnline Shop (O)" +
                "\nHot Dog (H)");

        selectedExample = exampleOption.nextLine();

        switch (selectedExample.toUpperCase()) {

            case "M":
                MusicPlayerMain.abstractFactoryMain();
                break;

            case "O":
                OnlineShopMain.onlineShopMain();
                break;

            case "H":
                HotDogMain.hotDogMain();
                break;


            default:
                System.out.println("That was not a valid example, please try again");


        }

    }
}
