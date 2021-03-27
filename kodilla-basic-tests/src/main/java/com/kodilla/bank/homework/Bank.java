package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {
    private CashMachine[] cashMachines = new CashMachine[0];

    public void addNewCashMachine(CashMachine newCashMachine) {
        CashMachine[] newTab = new CashMachine[cashMachines.length + 1];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[newTab.length - 1] = newCashMachine;
        this.cashMachines = newTab;
    }

    public double getBalance() {
        return Arrays.stream(cashMachines)
                .mapToDouble(CashMachine::getBalance)
                .sum();
    }

    public long getTotalNumberOfWithdrawals() {
        return Arrays.stream(cashMachines)
                .mapToLong(CashMachine::getNumberOfWithdrawals)
                .sum();
    }

    public long getTotalNumberOfDeposits() {
        return Arrays.stream(cashMachines)
                .mapToLong(CashMachine::getNumberOfDeposits)
                .sum();
    }

    public double getAverageOfWithdrawals() {
        return Arrays.stream(cashMachines)
                .mapToDouble(CashMachine::getAverageWithdrawals)
                .sum();
    }

    public double getAverageOfDeposits() {
        return Arrays.stream(cashMachines)
                .mapToDouble(CashMachine::getAverageDeposits)
                .sum();
    }
}