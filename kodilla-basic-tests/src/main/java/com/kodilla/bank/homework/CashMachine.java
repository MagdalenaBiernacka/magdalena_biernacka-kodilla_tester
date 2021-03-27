package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class CashMachine {

    private int[] completedTransactions = new int[0];

    public void addCompletedTransaction(int amount) {
        int[] newTab = new int[completedTransactions.length + 1];
        System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
        newTab[newTab.length - 1] = amount;
        this.completedTransactions = newTab;
    }

    public int[] getCompletedTransactions() {
        return completedTransactions;
    }

    public double getBalance() {
        return Arrays.stream(completedTransactions)
                .sum();
    }

    public int getNumberOfTransaction() {
        return completedTransactions.length;
    }

    public long getNumberOfWithdrawals() {
        return Arrays.stream(completedTransactions)
                .filter(Transaction::isWithdrawal) // dwa :: podają referencję do funkcji
                .count();
    }

    public long getNumberOfDeposits() {
        IntPredicate isDeposits = (int transaction) -> transaction > 0;
        return Arrays.stream(completedTransactions)
                .filter(isDeposits)
                .count();
    }

    public double getAverageWithdrawals() {
        return Arrays.stream(completedTransactions)
                .filter(Transaction::isWithdrawal)
                .average()
                .orElse(0);
    }

    public double getAverageDeposits() {
        return Arrays.stream(completedTransactions)
                .filter(Transaction::isDeposit)
                .average()
                .orElse(0);
    }
}