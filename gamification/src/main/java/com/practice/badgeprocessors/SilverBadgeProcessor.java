package com.practice.badgeprocessors;

import java.util.List;
import java.util.Optional;

import com.practice.ChallengeSolvedDTO;
import com.practice.domain.BadgeType;
import com.practice.domain.ScoreCard;

public class SilverBadgeProcessor implements BadgeProcessor {

	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedDTO solved) {
		// TODO Auto-generated method stub
		return currentScore > 150 ? Optional.of(BadgeType.SILVER) : Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		// TODO Auto-generated method stub
		return BadgeType.SILVER;
	}

}
