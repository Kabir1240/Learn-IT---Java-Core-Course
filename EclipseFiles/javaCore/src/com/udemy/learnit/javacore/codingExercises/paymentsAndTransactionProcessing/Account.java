package com.udemy.learnit.javacore.codingExercises.paymentsAndTransactionProcessing;

public class Account {
    private static final int MAX_TRANSACTION_AMOUNT = 10;

    private int id;
    private Transaction[] transactions;
    private int transactionCurrentIndex;

    {
        transactions = new Transaction[MAX_TRANSACTION_AMOUNT];
        transactionCurrentIndex = 0;
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        StandardAccountOperations sendOperation = StandardAccountOperations.MONEY_TRANSFER_SEND;
        Transaction sendTransaction = new Transaction(this, accountTo, moneyAmount, sendOperation);
        this.transactions[transactionCurrentIndex] = sendTransaction;
        accountTo.receiveMoneyFromAccount(this, moneyAmount);
        transactionCurrentIndex++;
    }

    public void receiveMoneyFromAccount(Account accountFrom, double moneyAmount) {
        StandardAccountOperations receiveOperation = StandardAccountOperations.MONEY_TRANSFER_RECEIVE;
        Transaction receiveTransaction = new Transaction(accountFrom, this, moneyAmount, receiveOperation);
        this.transactions[transactionCurrentIndex] = receiveTransaction;
        transactionCurrentIndex++;
    }

    public void withdrawMoney(double moneyAmount) {
        StandardAccountOperations operation = StandardAccountOperations.WITHDRAW;
        Transaction transaction = new Transaction(this, null, moneyAmount, operation);
        this.transactions[transactionCurrentIndex] = transaction;
        transactionCurrentIndex++;
    }

    public Transaction[] getTransactions() {
        int nonNullTransactionsAmount = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                nonNullTransactionsAmount++;
            }
        }

        Transaction[] filteredTransactions = new Transaction[nonNullTransactionsAmount];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                filteredTransactions[index++] = transaction;
            }
        }
        return filteredTransactions;
    }

    public static class Transaction {
        Account accountFrom;
        Account accountTo;
        double moneyAmount;
        StandardAccountOperations operation;

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation){
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation = operation;
        }

        public Account getAccountFrom() {
            return accountFrom;
        }

        public void setAccountFrom(Account accountFrom) {
            this.accountFrom = accountFrom;
        }

        public Account getAccountTo() {
            return accountTo;
        }

        public void setAccountTo(Account accountTo) {
            this.accountTo = accountTo;
        }

        public double getMoneyAmount() {
            return moneyAmount;
        }

        public void setMoneyAmount(double moneyAmount) {
            this.moneyAmount = moneyAmount;
        }

        public StandardAccountOperations getOperation() {
            return operation;
        }

        public void setOperation(StandardAccountOperations operation) {
            this.operation = operation;
        }

        public String toString() {
            return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo
                    + ", moneyAmount=" + moneyAmount + ", operation=" + operation + "]";
        }
    }
}
