package com.sparkdev.graphqlapp.domain;

import com.sparkdev.graphqlapp.enums.TransactionType;
import lombok.Builder;

@Builder
public record TransactionDetails(float trnxAmount, TransactionType trnxType) {
}
