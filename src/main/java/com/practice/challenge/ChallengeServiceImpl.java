package com.practice.challenge;

import java.util.List;

import org.springframework.stereotype.Service;


import com.practice.user.User;
import com.practice.user.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChallengeServiceImpl implements ChallengeService {

	private final UserRepository userRepository;
	private final ChallengeAttemptRepository attemptRepository;

	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
		// Check if the user already exists for that alias, otherwise create it
		User user = userRepository.findByAlias(attemptDTO.getUserAlias())
				.orElseGet(()->{
					log.info("Creating new user with alias {}",
							attemptDTO.getUserAlias());
					
					return userRepository.save(new User(attemptDTO.getUserAlias()));
					
				});
		
		// We don't use identifiers for now
		//User user = new User(null, attemptDTO.getUserAlias());
		
		// Check if the attempt is correct
		boolean isCorrect = attemptDTO.getGuess() == 
				attemptDTO.getFactorA() * attemptDTO.getFactorB();
		
		
		// Builds the domain object. Null id for now.
		ChallengeAttempt checkedAttempt = new ChallengeAttempt(
				null, 
				user, 
				attemptDTO.getFactorA(), 
				attemptDTO.getFactorB(), 
				attemptDTO.getGuess(), 
				isCorrect);
		
		// Stores the attempt
		ChallengeAttempt storedAttempt = attemptRepository.save(checkedAttempt);
		
		return storedAttempt;
	}

	@Override
	public List<ChallengeAttempt> getStatsForUser(String userAlias) {
		// TODO Auto-generated method stub
		return attemptRepository.findTop10ByUserAliasOrderByIdDesc(userAlias);
	}

}
