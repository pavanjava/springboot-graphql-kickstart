package com.sparkdev.graphqlapp.domain;

import com.sparkdev.graphqlapp.enums.Difficulty;
import com.sparkdev.graphqlapp.enums.Trainer;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record GraphqlClass(UUID id, Trainer trainer, LocalDateTime startsAt, LocalDateTime endsAt, Difficulty difficulty) {
}
