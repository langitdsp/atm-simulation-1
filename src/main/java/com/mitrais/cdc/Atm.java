package com.mitrais.cdc;

import java.util.Scanner;

import com.mitrais.cdc.screen.WelcomeScreen;

/**
 * Hello world!
 *
 */
public class Atm 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        WelcomeScreen welcomeScreen = new WelcomeScreen(scanner);

        while(true){
            welcomeScreen.start();
        }

//        scanner.close();
    }

}