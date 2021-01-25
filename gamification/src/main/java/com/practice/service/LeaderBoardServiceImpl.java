package com.practice.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.practice.domain.LeaderBoardRow;
import com.practice.repos.BadgeRepository;
import com.practice.repos.ScoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaderBoardServiceImpl implements LeaderBoardService {
	private final ScoreRepository scoreRepository;
	private final BadgeRepository badgeRepository;

	@Override
	public List<LeaderBoardRow> getCurrentLeaderBoard() {
		// Get score only
		List<LeaderBoardRow> scoreOnly = scoreRepository.findFirst10();

		// Combine with badges
		return scoreOnly.stream().map(row -> {
			List<String> badges = badgeRepository.findByUserIdOrderByBadgeTimestampDesc(row.getUserId())
					.stream()
					.map(b -> b.getBadgeType().getDescription())
					.collect(Collectors.toList());
			return row.withBadges(badges);
		}).collect(Collectors.toList());
	}

}
