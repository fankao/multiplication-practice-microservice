package com.practice.challenge;

import javax.validation.constraints.*;

import lombok.Value;

/**
 * Attempt coming from user
 * 
 * @author NMC
 *
 */
@Value
public class ChallengeAttemptDTO {
	@Min(1)
	@Max(99)
	int factorA, factorB;
	
	@NotBlank
	String userAlias;

	@Positive(message = "How could you possibly get a negative result here? Try again.")
	int guess;

}
