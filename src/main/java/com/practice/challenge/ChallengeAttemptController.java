package com.practice.challenge;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
class ChallengeAttemptController {
	
	private final ChallengeService challengeService;

	@PostMapping
	ResponseEntity<ChallengeAttempt> postAttempt(@RequestBody @Valid ChallengeAttemptDTO attemptDTO) {
		return ResponseEntity
				.ok(challengeService.verifyAttempt(attemptDTO));
	}

}
