package com.practice.challenge;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChallengeServiceTest {
	private ChallengeService challengeService;

	@BeforeEach
	void setUp() throws Exception {
		challengeService = new ChallengeServiceImpl();
	}

	@Test
	void checkCorrectAttemptTest() {
		// given
		ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

		// when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

		// then
		then(resultAttempt.isCorrect()).isTrue();
	}

	@Test
	void checkWrongAttemptTest() {
		// given
		ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 5000);

		// when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

		// then
		then(resultAttempt.isCorrect()).isFalse();
	}

}
