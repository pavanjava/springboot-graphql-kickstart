package com.sparkdev.graphqlapp.domain;

import com.sparkdev.graphqlapp.enums.Currency;

import java.util.List;

public record BankAccount(int id, String acctHolderName, float amount, Currency currency,
                          List<TransactionDetails> transactionDetails) {


}
