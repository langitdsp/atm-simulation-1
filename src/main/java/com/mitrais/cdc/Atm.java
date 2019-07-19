package com.mitrais.cdc;

import java.util.ArrayList;
import java.util.Scanner;

import com.mitrais.cdc.model.Account;
import com.mitrais.cdc.utils.Utils;

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
        
        welcomeScreen.start();

        scanner.close();
    }

}