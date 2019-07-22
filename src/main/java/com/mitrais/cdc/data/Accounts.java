package com.mitrais.cdc.data;

import com.mitrais.cdc.model.Account;

import java.util.ArrayList;

public class Accounts {
    private static Accounts accountsInstance = new Accounts();
    private static ArrayList<Account> accounts;

    public static Accounts getInstance() {
        return accountsInstance;
    }

    public static Account loginAccount(String accountNumber, String pin) {
        Account account = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber) && acc.getPin().equals(pin)) {
                account = acc;
                break;
            }
        }
        return account;
    }

    public static Account findAccount(String accountNumber) {
        Account account = null;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                account = acc;
                break;
            }
        }
        return account;
    }

    private Accounts() {
        accounts = new ArrayList<Account>();
        accounts.add(new Account("John Doe", "112233", 100, "012108"));
        accounts.add(new Account("Jane Doe", "112244", 30, "932012"));
    }
}
