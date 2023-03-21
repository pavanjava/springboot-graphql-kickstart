package com.sparkdev.graphqlapp.controller;

import com.sparkdev.graphqlapp.domain.GraphqlClass;
import com.sparkdev.graphqlapp.enums.Difficulty;
import com.sparkdev.graphqlapp.enums.Trainer;
import graphql.GraphQLContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Controller
public class TrainingController {

    @QueryMapping
    public List<GraphqlClass> attendClass(@Argument Trainer trainer, GraphQLContext graphQLContext) {
        log.info("schedule({})", trainer);
        var startsAt = LocalDateTime.now();
        return List.of(
                GraphqlClass.builder()
                        .id(UUID.randomUUID())
                        .trainer(trainer)
                        .startsAt(startsAt)
                        .endsAt(startsAt.plusHours(2L))
                        .difficulty(Difficulty.BEGINNER)
                        .build()
        );
    }
}
