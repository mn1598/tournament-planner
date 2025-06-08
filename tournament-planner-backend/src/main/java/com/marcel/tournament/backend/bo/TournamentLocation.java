package com.marcel.tournament.backend.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentLocation {
    private String city;
    private String venue;
}
