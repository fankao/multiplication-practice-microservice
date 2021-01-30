package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practice.domain.ChallengeSolvedEvent;
import com.practice.service.GameService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/attempts")
@RequiredArgsConstructor
public class GameController {
	private final GameService gameService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void postResult(@RequestBody ChallengeSolvedEvent solvedDTO) {
		gameService.newAttemptForUser(solvedDTO);
	}

}
