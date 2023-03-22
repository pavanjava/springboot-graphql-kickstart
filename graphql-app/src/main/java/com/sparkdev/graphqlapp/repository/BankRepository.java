package com.sparkdev.graphqlapp.repository;

import com.sparkdev.graphqlapp.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Integer> {
}
