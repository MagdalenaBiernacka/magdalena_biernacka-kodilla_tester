package com.kodilla.bank.homework;

public class CashMachine {

    private int[] completedTransactions;
    private int numberOfTransaction;
    private int balance;



    public CashMachine() {
        this.completedTransactions = new int[0];
        this.numberOfTransaction = 0;
        this.balance = 0;

    }

    public void addCompletedTransaction(int amount) {
        this.numberOfTransaction++;
        int[] newTab = new int[this.numberOfTransaction];
        System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
        newTab[this.numberOfTransaction - 1] = amount;
        this.completedTransactions = newTab;
    }

    public int[] getCompletedTransactions() {
        return completedTransactions;
    }

    public double getActualBalance() {
        if (this.completedTransactions.length == 0) {
            return 0;
        }
        return this.balance;
    }

    public int getNumberOfTransaction() {
        return numberOfTransaction;
    }
}
