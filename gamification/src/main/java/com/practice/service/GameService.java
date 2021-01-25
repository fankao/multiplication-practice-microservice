package com.practice.service;

import java.util.List;

import com.practice.domain.BadgeType;
import com.practice.domain.ChallengeSolvedDTO;

import lombok.Value;

public interface GameService {
	/**
	 * Process a new attempt from a given user.
	 * 
	 * @param challenge the challenge data with user details, factors, etc.
	 * @return a {@link GameResult} object containing the new score and badge cards
	 *         obtained
	 */
	GameResult newAttemptForUser(ChallengeSolvedDTO challenge);

	@Value
	class GameResult {
		int score;
		List<BadgeType> badges;
	}
}
