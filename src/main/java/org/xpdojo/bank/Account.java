package org.xpdojo.bank;

public class Account {
    public int balance = 0;

    public void deposit(int i) {
        this.balance += i;
    }
}
