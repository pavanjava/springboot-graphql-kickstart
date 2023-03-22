package com.sparkdev.graphqlapp.domain.input;

import com.sparkdev.graphqlapp.domain.response.BankAccount;
import com.sparkdev.graphqlapp.entities.Bank;
import com.sparkdev.graphqlapp.enums.Currency;
import com.sparkdev.graphqlapp.repository.BankRepository;
import lombok.Builder;

@Builder
public record OpenAccount(String acctHolderName, float amount, Currency currency) {

    public static Bank mapToEntity(OpenAccount bankAccount){
        var bankEntity = Bank.builder()
                .accountHolderName(bankAccount.acctHolderName())
                .currentBalance(bankAccount.amount())
                .currencyType(bankAccount.currency().name())
                .build();
        return bankEntity;
    }

    public static BankAccount mapToResponse(Bank bankAccount){
        return BankAccount.builder()
                .id(bankAccount.getId())
                .acctHolderName(bankAccount.getAccountHolderName())
                .amount(bankAccount.getCurrentBalance())
                .currency(getCurrency(bankAccount.getCurrencyType()))
                .build();
    }

    private static Currency getCurrency(String currency){
        switch (currency){
            case "USD":
                return Currency.USD;
            case "INR":
                return Currency.INR;
            case "EUR":
                return Currency.EUR;
        }
        return Currency.DUMMY;
    }

    public static BankAccount saveBankDetails(BankRepository bankRepository, Bank bank){
        Bank savedObject = bankRepository.save(bank);
        return mapToResponse(savedObject);
    }

}
