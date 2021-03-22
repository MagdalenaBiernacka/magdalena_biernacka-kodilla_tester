package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroTransaction() {
        CashMachine cashMachine = new CashMachine();
        int[] completedTransaction = cashMachine.getCompletedTransactions();
        assertEquals(0, completedTransaction.length);
    }

    @Test
    public void shouldAddElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addCompletedTransaction(10);
        cashMachine.addCompletedTransaction(-100);
        cashMachine.addCompletedTransaction(100);

        int[] completedTransaction = cashMachine.getCompletedTransactions();
        assertEquals(3, completedTransaction.length);
        assertEquals(10, completedTransaction[0]);
        assertEquals(-100, completedTransaction[1]);
        assertEquals(100, completedTransaction[2]);
    }

    @Test
    public void actualBalanceShouldBeZEroIfThereWasNoTransaction() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getActualBalance());
    }

    @Test
    public void GoodNumberOfTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addCompletedTransaction(20);
        cashMachine.addCompletedTransaction(-1000);
        cashMachine.addCompletedTransaction(10000);

        int numberTransaction = cashMachine.getNumberOfTransaction();
        assertEquals(3, numberTransaction);
    }
}
