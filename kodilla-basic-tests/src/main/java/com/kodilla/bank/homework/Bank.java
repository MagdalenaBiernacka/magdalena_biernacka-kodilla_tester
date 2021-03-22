package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
    }

    public void addNewCashMachine(CashMachine newCashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfCashMachines - 1] = newCashMachine;
        this.cashMachines= newTab;
    }

    public double getTotalBalance() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double  sum = 0;
        for(int CashMachineNumber = 0; CashMachineNumber  < this.cashMachines.length; CashMachineNumber ++)
            sum += this.cashMachines[CashMachineNumber].getActualBalance();
        return sum;
    }

    public int getTotalNumberOfWithdrawals() {
        return 10;
    }

    public int getTotalNumberOfDeposits() {
        return 12;
    }

    public double getAverageOfWithdrawals() {
        return 10;
    }

    public double getAverageOfDeposits(){
        return 5;
    }
}
