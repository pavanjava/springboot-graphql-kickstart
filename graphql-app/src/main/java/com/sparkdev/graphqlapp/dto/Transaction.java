package com.sparkdev.graphqlapp.dto;

import com.sparkdev.graphqlapp.enums.TransactionType;

public record Transaction(TransactionType trnxType, float trnxAmount) {
}
