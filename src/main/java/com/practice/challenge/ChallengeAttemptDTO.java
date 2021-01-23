package com.practice.challenge;

import lombok.Value;

/**
 * Attempt coming from user
 * @author NMC
 *
 */
@Value
public class ChallengeAttemptDTO {
	int factorA, factorB;
	String userAlias;
	int guess;

}
