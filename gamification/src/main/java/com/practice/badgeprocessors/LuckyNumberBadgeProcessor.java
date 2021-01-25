package com.practice.badgeprocessors;

import java.util.List;
import java.util.Optional;

import com.practice.domain.BadgeType;
import com.practice.domain.ChallengeSolvedDTO;
import com.practice.domain.ScoreCard;

public class LuckyNumberBadgeProcessor implements BadgeProcessor {

	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedDTO solved) {
		// TODO Auto-generated method stub
		return solved.getFactorA() == 42 || solved.getFactorB() == 42 ?
				Optional.of(BadgeType.LUCKY_NUMBER)
				: Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		// TODO Auto-generated method stub
		return BadgeType.LUCKY_NUMBER;
	}

}
