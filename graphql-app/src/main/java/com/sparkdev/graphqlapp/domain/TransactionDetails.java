package com.sparkdev.graphqlapp.domain;

import com.sparkdev.graphqlapp.enums.TransactionType;
import lombok.Builder;

@Builder
public record TransactionDetails(int id, float trnxAmount, TransactionType trnxType) {
}
