package com.marcel.tournament.backend.service.impl;

import com.marcel.tournament.backend.bo.Tournament;
import com.marcel.tournament.backend.service.ITournamentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TournamentService implements ITournamentService {

    private final List<Tournament> tournaments = new ArrayList<>();

    @Override
    public Tournament createTournament(Tournament tournament) {
        tournaments.add(tournament);
        return tournament;
    }

    @Override
    public List<Tournament> getTournamentByName(String tournamentName) {
        return tournaments.stream().filter(getTournamentByNamePredicate(tournamentName)).collect(Collectors.toList());
    }

    @Override
    public void updateTournament(Tournament tournament) {
        tournaments.stream().filter(getTournamentByIdPredicate(tournament)).findFirst().ifPresent(
                getTournamentUpdateConsumer(tournament));
    }

    @Override
    public boolean deleteTournamentById(Integer id) {
        return tournaments.removeIf(tournament -> tournament.getId().equals(id));
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return tournaments;
    }

    private static Consumer<Tournament> getTournamentUpdateConsumer(Tournament tournament) {
        return t -> { // todo only update if field is not null/empty
            t.setName(tournament.getName());
            t.setStartDate(tournament.getStartDate());
            t.setEndDate(tournament.getEndDate());
            t.setWinner(tournament.getWinner());
            t.setLocation(tournament.getLocation());
        };
    }

    private static Predicate<Tournament> getTournamentByIdPredicate(Tournament tournament) {
        return t -> t.getId().equals(tournament.getId());
    }

    private static Predicate<Tournament> getTournamentByNamePredicate(String tournamentName) {
        return tournament -> tournament.getName().equals(tournamentName);
    }
}
