package com.marcel.tournament.backend.controller;

import com.marcel.tournament.backend.bo.Tournament;
import org.springframework.web.bind.annotation.*;

@RestController("/api/tournaments")
public class TournamentController {

    @GetMapping()
    public String getAllTournament() {
        return "Tournament";
    }

    @GetMapping("/{name}")
    public String getTournament(@PathVariable String name) {
        return "Tournament: " + name;
    }

    @PostMapping()
    public String postTournament(@RequestBody Tournament tournament) {
        return "Tournament: " + tournament.getName();
    }

    @PutMapping("/{id}")
    public String putTournament(@RequestBody Tournament tournament,
                                @PathVariable Integer id) {
        return "Tournament: " + tournament.getName();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTournament(@PathVariable Integer id) {
        return "Tournament: " + id;
    }

}
