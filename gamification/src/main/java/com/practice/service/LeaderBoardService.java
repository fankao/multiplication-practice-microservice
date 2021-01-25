package com.practice.service;

import java.util.List;

import com.practice.domain.LeaderBoardRow;

public interface LeaderBoardService {
	/**
	 * @return the current leader board ranked from high to low score
	 */
	List<LeaderBoardRow> getCurrentLeaderBoard();
}
