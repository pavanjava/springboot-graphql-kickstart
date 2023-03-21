package com.sparkdev.graphqlapp.resolver;

import com.sparkdev.graphqlapp.domain.BankAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class BankAccountResolver {

    @QueryMapping
    public BankAccount fetchBankAccount(@Argument int id){
        return BankAccount.getById(id);
    }
}
