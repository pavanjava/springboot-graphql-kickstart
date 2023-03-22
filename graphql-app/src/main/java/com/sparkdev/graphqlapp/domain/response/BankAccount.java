package com.sparkdev.graphqlapp.domain.response;

import com.sparkdev.graphqlapp.enums.Currency;
import lombok.Builder;

@Builder
public record BankAccount(int id, String acctHolderName, float amount, Currency currency) {
}
