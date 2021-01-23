package com.practice.challenge;

public interface ChallengeService {
	/**
	 * Verifies if an attempt coming from the presentation layer is correct or not
	 * @param resultAttempt
	 * @return the resulting ChallengeAttempt object
	 */
	ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);

}
