package com.sparkdev.graphqlapp.resolver;

import com.sparkdev.graphqlapp.domain.input.OpenAccount;
import com.sparkdev.graphqlapp.repository.BankRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class BankAccountResolver {

    private final BankRepository bankRepository;

    public BankAccountResolver(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @QueryMapping
    public OpenAccount fetchBankAccount(@Argument int id){
        return null;
    }
}
