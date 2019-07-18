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

        // Create initial data
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(new Account("John Doe", "012108", 100, "112233"));
        accounts.add(new Account("Jane Doe", "932012", 30, "112244"));

        WelcomeScreen welcomeScreen = new WelcomeScreen(accounts, scanner);
        
        welcomeScreen.start();

        scanner.close();
    }

}