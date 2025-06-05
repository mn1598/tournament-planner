package com.marcel.tournament.backend.service;

import com.marcel.tournament.backend.bo.Tournament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITournamentService {

    Tournament createTournament(Tournament tournament);

    List<Tournament> getTournamentByName(String tournamentName);

    Tournament updateTournament(Tournament tournament);

    Tournament deleteTournamentById(Integer id);

    List<Tournament> getAllTournaments();

}
