package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
    private String voteOption;
    private Long voteCount = 0L;
}
