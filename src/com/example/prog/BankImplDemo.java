package com.example.prog;

public class BankImplDemo {

    public static void main(String[] args) {

        
        Bank bank = new BankImpl();

        
        Account account = new Account(12345, "punith", 18000, bank);

       
        bank.deposit(account, 2000);
        System.out.println(account);

        // Withdraw money
        bank.withdraw(account, 1000);
        System.out.println(account);
    }
}



