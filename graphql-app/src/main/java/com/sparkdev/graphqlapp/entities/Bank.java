package com.sparkdev.graphqlapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bank_details")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String accountHolderName;
    @Column
    float currentBalance;
    @Column
    String currencyType;
}
