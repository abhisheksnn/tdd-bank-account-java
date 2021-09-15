package org.xpdojo.bank;

public class Account {
    public int balance = 0;

    public void deposit(int i) {
        this.balance += i;
    }

    public void withdraw(int i) {
        balance -= i;
    }

    public void transfer(Account account2, int i) {
        this.withdraw(i);
        account2.deposit(i);
    }
}
