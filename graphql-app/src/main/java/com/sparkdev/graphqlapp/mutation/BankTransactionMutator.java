package com.sparkdev.graphqlapp.mutation;

import com.sparkdev.graphqlapp.domain.BankAccount;
import com.sparkdev.graphqlapp.dto.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class BankTransactionMutator {

    @MutationMapping
    public BankAccount debitAmount(@Argument int id, @Argument Transaction transaction){
        return BankAccount.debitAmount(id, transaction);
    }
}
