package com.tournament.tournament.backend;

import org.springframework.boot.SpringApplication;

public class TestTournamentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(TournamentBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
