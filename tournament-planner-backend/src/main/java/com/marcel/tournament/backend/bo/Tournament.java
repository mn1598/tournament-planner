package com.marcel.tournament.backend.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tournament {
    private String name;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate; // Optional
    private TournamentLocation location;
    private Team winner;
}
