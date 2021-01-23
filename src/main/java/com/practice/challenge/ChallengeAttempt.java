package com.practice.challenge;

import com.practice.user.User;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Identifies the attempt from a {@link User} to solve Challenge
 * @author NMC
 *
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
	private Long id;
	private User userId;
	private int factorA;
	private int factorB;
	private int resultAttempt;
	private boolean correct;

}
