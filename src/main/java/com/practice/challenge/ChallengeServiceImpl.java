package com.practice.challenge;

import org.springframework.stereotype.Service;

import com.practice.user.User;
@Service
public class ChallengeServiceImpl implements ChallengeService {

	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {
		// Check if the attempt is correct
		boolean isCorrect = resultAttempt.getGuess() == 
				resultAttempt.getFactorA() * resultAttempt.getFactorB();
		
		// We don't use identifiers for now
		User user = new User(null, resultAttempt.getUserAlias());
		
		// Builds the domain object. Null id for now.
		ChallengeAttempt challengeAttempt = new ChallengeAttempt(
				null, 
				user, 
				resultAttempt.getFactorA(), 
				resultAttempt.getFactorB(), 
				resultAttempt.getGuess(), 
				isCorrect);
		
		return challengeAttempt;
	}

}
