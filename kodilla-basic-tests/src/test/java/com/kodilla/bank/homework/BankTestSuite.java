package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroBalanceWithoutCashMachines() {

        Bank cashMachinesPoznan = new Bank();

        double totalBalance = cashMachinesPoznan.getTotalBalance();
        assertEquals(0, totalBalance);
    }

    @Test
    public void shouldGetTotalBalanceWithNewCashMachine() {

        Bank cashMachinesPoznan = new Bank();
        CashMachine cashMachineNumberOne = new CashMachine();
        cashMachineNumberOne.addCompletedTransaction(100);
        cashMachineNumberOne.addCompletedTransaction(1000);
        cashMachineNumberOne.addCompletedTransaction(-100);
        cashMachinesPoznan.addNewCashMachine(cashMachineNumberOne);

        double totalBalance = cashMachinesPoznan.getTotalBalance();
        assertEquals(1000, totalBalance);
    }
}
