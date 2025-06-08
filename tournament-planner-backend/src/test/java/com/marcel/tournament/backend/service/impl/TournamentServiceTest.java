package com.marcel.tournament.backend.service.impl;

import com.marcel.tournament.backend.bo.Team;
import com.marcel.tournament.backend.bo.Tournament;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentServiceTest {

    TournamentService uut;


    @BeforeEach
    void setUp() {
        uut = new TournamentService();
        Tournament tournament = new Tournament();
        tournament.setId(1);
        tournament.setName("Tournament");
        tournament.setWinner(new Team());

        uut.createTournament(tournament);
    }

    @Test
    void createTournament() {
        Tournament tournament = new Tournament();
        tournament.setName("Tournament Create Test");
        Tournament actual = uut.createTournament(tournament);

        assertEquals("Tournament Create Test", actual.getName());
        assertEquals(2, uut.getAllTournaments().size());
    }

    @Test
    void getTournamentByName() {

    }

    @Test
    void updateTournament() {
    }

    @Test
    void deleteTournamentById() {
    }

    @Test
    void getAllTournaments() {
    }
}
