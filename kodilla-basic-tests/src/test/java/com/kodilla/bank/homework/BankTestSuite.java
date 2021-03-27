package com.kodilla.bank.homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank;

    @BeforeEach
    public void setup() {
        bank = new Bank();
    }

    @Test
    public void shouldHaveZeroBalanceWithoutCashMachines() {
        assertEquals(0, bank.getBalance());
    }

    @Test
    public void returnsBalanceOfSingleCashMachineTransactions() {
        // given
        CashMachine cashMachine = new CashMachine();
        bank.addNewCashMachine(cashMachine);

        // when
        cashMachine.addCompletedTransaction(100);
        cashMachine.addCompletedTransaction(1000);
        cashMachine.addCompletedTransaction(-100);

        // then
        assertEquals(1000, bank.getBalance());
    }

    @Test
    public void returnsBalanceOfMultipleCashMachineTransactions() {
        // given
        CashMachine firstCashMachine = new CashMachine();
        CashMachine secondCashMachine = new CashMachine();
        bank.addNewCashMachine(firstCashMachine);
        bank.addNewCashMachine(secondCashMachine);

        // when
        firstCashMachine.addCompletedTransaction(100);
        firstCashMachine.addCompletedTransaction(1000);
        firstCashMachine.addCompletedTransaction(-100);

        secondCashMachine.addCompletedTransaction(500);
        secondCashMachine.addCompletedTransaction(100);

        // then
        assertEquals(1600, bank.getBalance());
    }

    @Test
    public void countsWithdrawals() {
        // given
        CashMachine cashMachine = new CashMachine();
        bank.addNewCashMachine(cashMachine);

        // when
        cashMachine.addCompletedTransaction(-100);
        cashMachine.addCompletedTransaction(-200);
        cashMachine.addCompletedTransaction(-300);
        cashMachine.addCompletedTransaction(100);

        // then
        assertEquals(3, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void countsDeposits() {
        // given
        CashMachine cashMachine = new CashMachine();
        bank.addNewCashMachine(cashMachine);

        // when
        cashMachine.addCompletedTransaction(100);
        cashMachine.addCompletedTransaction(200);
        cashMachine.addCompletedTransaction(300);
        cashMachine.addCompletedTransaction(400);
        cashMachine.addCompletedTransaction(-100);

        // then
        assertEquals(4, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void zeroAverageOfWithdrawalsForBankWithoutCashMachines() {
        assertEquals(0, bank.getAverageOfWithdrawals(), 0.0001);
    }

    @Test
    public void zeroAverageOfDepositsForBankWithoutCashMachines() {
        assertEquals(0, bank.getAverageOfDeposits(), 0.0001);
    }

    @Test
    public void calculatesAverageOfWithdrawals() {
        // given
        CashMachine cashMachine = new CashMachine();
        bank.addNewCashMachine(cashMachine);

        // when
        cashMachine.addCompletedTransaction(500);
        cashMachine.addCompletedTransaction(-500);
        cashMachine.addCompletedTransaction(-100);
        cashMachine.addCompletedTransaction(-400);
        cashMachine.addCompletedTransaction(-1000);

        // then
        assertThat(bank.getAverageOfWithdrawals()).isEqualTo(-500);
    }

    @Test
    public void calculatesAverageOfDeposits() {
        // given
        CashMachine cashMachine = new CashMachine();
        bank.addNewCashMachine(cashMachine);

        // when
        cashMachine.addCompletedTransaction(-500);
        cashMachine.addCompletedTransaction(500);
        cashMachine.addCompletedTransaction(100);
        cashMachine.addCompletedTransaction(400);
        cashMachine.addCompletedTransaction(1000);

        // then
        assertThat(bank.getAverageOfDeposits()).isEqualTo(500);
    }
}
