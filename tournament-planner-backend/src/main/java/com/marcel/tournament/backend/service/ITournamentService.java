package com.marcel.tournament.backend.service;

import com.marcel.tournament.backend.bo.Tournament;

import java.util.List;

public interface ITournamentService {

    Tournament createTournament(Tournament tournament);

    List<Tournament> getTournamentByName(String tournamentName);

    void updateTournament(Tournament tournament);

    boolean deleteTournamentById(Integer id);

    List<Tournament> getAllTournaments();

}
