package com.sparkdev.graphqlapp.domain;

import com.sparkdev.graphqlapp.enums.Currency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record BankAccount(int id, String acctHolderName, float amount, Currency currency) {

    private static List<BankAccount> bankAccounts = Arrays.asList(
            new BankAccount(1,"pavan mantha",30000.0f, Currency.INR),
            new BankAccount(2,"arun boppudi",35000.0f, Currency.USD),
            new BankAccount(3,"ravi vadlamani",30000.0f, Currency.EUR)
    );

    public static BankAccount getById(int id){
        var dummyBankAccount = new BankAccount(0, "", 0.0f, Currency.DUMMY);
        return bankAccounts.stream().filter(bankAccount -> bankAccount.id() == id).findFirst().orElse(dummyBankAccount);
    }
}
