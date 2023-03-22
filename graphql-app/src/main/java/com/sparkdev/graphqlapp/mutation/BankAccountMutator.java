package com.sparkdev.graphqlapp.mutation;

import com.sparkdev.graphqlapp.domain.input.OpenAccount;
import com.sparkdev.graphqlapp.domain.response.BankAccount;
import com.sparkdev.graphqlapp.entities.Bank;
import com.sparkdev.graphqlapp.repository.BankRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class BankAccountMutator {

    private final BankRepository bankRepository;

    public BankAccountMutator(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    @MutationMapping
    public OpenAccount debitAmount(@Argument int id){
        return null;
    }

    @MutationMapping
    public BankAccount createBankAccount(@Argument OpenAccount openAccount){
        Bank bankDetails = OpenAccount.mapToEntity(openAccount);
        return OpenAccount.saveBankDetails(bankRepository, bankDetails);
    }
}
