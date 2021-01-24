package com.practice.challenge;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ChallengeAttemptRepository extends CrudRepository<ChallengeAttempt, Long> {
	/**
	 * 
	 * @param userAlias
	 * @return 
	 */
	List<ChallengeAttempt> findTop10ByUserAliasOrderByIdDesc(String userAlias);
}
