package com.practice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.practice.domain.ScoreCard;

public interface ScoreRepository extends CrudRepository<ScoreCard, Long> {

	Optional<Integer> getTotalScoreForUser(Long userId);

	List<ScoreCard> findByUserIdOrderByScoreTimestampDesc(Long userId);

}
