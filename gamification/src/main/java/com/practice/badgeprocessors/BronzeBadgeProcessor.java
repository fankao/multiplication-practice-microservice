package com.practice.badgeprocessors;

import java.util.List;
import java.util.Optional;

import com.practice.domain.BadgeType;
import com.practice.domain.ChallengeSolvedEvent;
import com.practice.domain.ScoreCard;

public class BronzeBadgeProcessor implements BadgeProcessor {

	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedEvent solved) {
		// TODO Auto-generated method stub
		return currentScore > 50 ? Optional.of(BadgeType.BRONZE) : Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		// TODO Auto-generated method stub
		return BadgeType.BRONZE;
	}

}
