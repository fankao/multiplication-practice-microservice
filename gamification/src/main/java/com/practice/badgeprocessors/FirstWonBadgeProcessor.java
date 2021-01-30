package com.practice.badgeprocessors;

import java.util.List;
import java.util.Optional;

import com.practice.domain.BadgeType;
import com.practice.domain.ChallengeSolvedEvent;
import com.practice.domain.ScoreCard;

public class FirstWonBadgeProcessor implements BadgeProcessor {

	@Override
	public Optional<BadgeType> processForOptionalBadge(int currentScore, List<ScoreCard> scoreCardList,
			ChallengeSolvedEvent solved) {
		// TODO Auto-generated method stub
		return scoreCardList.size() == 1 ?
				Optional.of(BadgeType.FIRST_WON) : Optional.empty();
	}

	@Override
	public BadgeType badgeType() {
		// TODO Auto-generated method stub
		return BadgeType.FIRST_WON;
	}

}
