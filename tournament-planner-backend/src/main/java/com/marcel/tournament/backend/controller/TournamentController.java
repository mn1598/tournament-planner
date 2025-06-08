package com.marcel.tournament.backend.controller;

import com.marcel.tournament.backend.bo.Tournament;
import com.marcel.tournament.backend.service.ITournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
@RequiredArgsConstructor
public class TournamentController {

    private final ITournamentService tournamentService;

    @GetMapping("/")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/{name}")
    public List<Tournament> getTournament(@PathVariable String name) {
        return tournamentService.getTournamentByName(name);
    }

    @PostMapping("/")
    public Tournament postTournament(@RequestBody Tournament tournament) {
        return tournamentService.createTournament(tournament);
    }

    @PutMapping("/")
    public void putTournament(@RequestBody Tournament tournament) {
        tournamentService.updateTournament(tournament);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteTournament(@PathVariable Integer id) {
        return tournamentService.deleteTournamentById(id);
    }

}
