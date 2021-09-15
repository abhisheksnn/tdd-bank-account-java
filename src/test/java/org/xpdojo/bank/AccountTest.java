package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.xpdojo.bank.Account;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat("Deposit works fine", account.balance, is(100));
    }


    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(100);
        assertThat("Withdraw works fine", account.balance, is(0));
    }

    @Test
    public void transferAnAmount() {
        Account account1 = new Account();
        account1.deposit(250);
        Account account2 = new Account();
        account1.transfer(account2,100);
        assertThat("Transfer works fine", account2.balance, is(100));
        assertThat("Transfer works fine", account1.balance, is(150));
    }
}
