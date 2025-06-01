package com.marcel.tournament.backend.controller;

import com.marcel.tournament.backend.bo.Tournament;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    @GetMapping("/")
    public List<Tournament> getAllTournaments() {
        return List.of();
    }

    @GetMapping("/{name}")
    public String getTournament(@PathVariable String name) {
        return name;
    }

    @PostMapping("/")
    public Tournament postTournament(@RequestBody Tournament tournament) {
        return tournament;
    }

    @PutMapping("/{id}")
    public Tournament putTournament(@RequestBody Tournament tournament,
                                @PathVariable Integer id) {
        return tournament;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTournament(@PathVariable Integer id) {
        return String.valueOf(id);
    }

}
