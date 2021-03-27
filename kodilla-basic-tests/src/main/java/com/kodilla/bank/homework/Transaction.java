package com.kodilla.bank.homework;


public class Transaction {
    public static boolean isWithdrawal(int transaction) {
        return transaction < 0;
    }

    public static boolean isDeposit(int transaction) {
        return transaction > 0;
    }
}