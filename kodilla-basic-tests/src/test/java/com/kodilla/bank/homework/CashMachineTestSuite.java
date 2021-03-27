package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroTransaction() {
        CashMachine cashMachine = new CashMachine();
        int[] completedTransaction = cashMachine.getCompletedTransactions();
        assertEquals(0, completedTransaction.length);
    }

    @Test
    public void storesTransaction() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addCompletedTransaction(10);
        cashMachine.addCompletedTransaction(-100);
        cashMachine.addCompletedTransaction(100);

        // then
        assertThat(cashMachine.getCompletedTransactions()).containsExactly(10, -100, 100);
    }

    @Test
    public void balanceIsZeroIfThereWereNoTransactions() {
        // given
        CashMachine cashMachine = new CashMachine();

        // then
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void calculatesBalance() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addCompletedTransaction(20);
        cashMachine.addCompletedTransaction(-1000);
        cashMachine.addCompletedTransaction(10000);

        // then
        assertEquals(9020, cashMachine.getBalance());
    }

    @Test
    public void returnNumberOfTransaction() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        cashMachine.addCompletedTransaction(20);
        cashMachine.addCompletedTransaction(-1000);
        cashMachine.addCompletedTransaction(10000);

        // then
        assertEquals(3, cashMachine.getNumberOfTransaction());
    }

    static Stream<Arguments> testWithdrawals() {
        return Stream.of(
                Arguments.of(0, new int[]{}),  // przypadek przy braku tranzakcji
                Arguments.of(1, new int[]{-100}), // przypadek z jedną tranzakcją
                Arguments.of(1, new int[]{-200, 100}), //przypadek z jedną wypłatą i wpłatą
                Arguments.of(2, new int[]{-100, 0, 100, -200, 1000}) //przypadek z różnymi wpłatami i wypłatami
        );
    }

    @ParameterizedTest
    @MethodSource("testWithdrawals")
    public void countsNumberOfWithdrawals(int expectedWithdrawals, int... transactions) {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        Arrays.stream(transactions)
                .forEachOrdered(cashMachine::addCompletedTransaction);

        // then
        assertThat(cashMachine.getNumberOfWithdrawals()).isEqualTo(expectedWithdrawals);
    }

    @ParameterizedTest
    @MethodSource
    public void countsNumberOfDeposits(int expectedDeposits, int... transactions) {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        Arrays.stream(transactions)
                .forEachOrdered(cashMachine::addCompletedTransaction);

        // then
        assertThat(cashMachine.getNumberOfDeposits()).isEqualTo(expectedDeposits);
    }

    static Stream<Arguments> countsNumberOfDeposits() {
        return Stream.of(
                Arguments.of(0, new int[]{}),  // przypadek przy braku tranzakcji
                Arguments.of(1, new int[]{100}), // przypadek z jedną wpłatą
                Arguments.of(1, new int[]{-200, 100}), //przypadek z jedną wypłatą i wpłatą
                Arguments.of(2, new int[]{-100, 0, 100, -200, 1000}) //przypadek z różnymi wpłatami i wypłatami
        );
    }

    @ParameterizedTest
    @MethodSource
    public void calculateAverageOfWithdrawals(double expectedAverage, int... transactions) {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        Arrays.stream(transactions)
                .forEachOrdered(cashMachine::addCompletedTransaction);

        // then
        assertThat(cashMachine.getAverageWithdrawals()).isEqualTo(expectedAverage);
    }

    static Stream<Arguments> calculateAverageOfWithdrawals() {
        return Stream.of(
                Arguments.of(0, new int[]{}),  // przypadek przy braku tranzakcji
                Arguments.of(0, new int[]{100}), // przypadek z jedną wpłatą
                Arguments.of(-100, new int[]{-100}), // przypadek z jedną wypłatą
                Arguments.of(-200, new int[]{-200, 100}), //przypadek z jedną wypłatą i wpłatą
                Arguments.of(-150, new int[]{-100, 0, 100, -200, 1000}) //przypadek z różnymi wpłatami i wypłatami
        );
    }

    @ParameterizedTest
    @MethodSource
    public void calculateAverageOfDeposits(double expectedAverage, int... transactions) {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        Arrays.stream(transactions)
                .forEachOrdered(cashMachine::addCompletedTransaction);

        // then
        assertThat(cashMachine.getAverageDeposits()).isEqualTo(expectedAverage);
    }

    static Stream<Arguments> calculateAverageOfDeposits() {
        return Stream.of(
                Arguments.of(0, new int[]{}),  // przypadek przy braku tranzakcji
                Arguments.of(100, new int[]{100}), // przypadek z jedną wpłatą
                Arguments.of(0, new int[]{-100}), // przypadek z jedną qyołatą
                Arguments.of(300, new int[]{-200, 300}), //przypadek z jedną wypłatą i wpłatą
                Arguments.of(1000, new int[]{-100, 0, 1000, -200, 1000}) //przypadek z różnymi wpłatami i wypłatami
        );
    }
}