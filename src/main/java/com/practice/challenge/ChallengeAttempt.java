package com.practice.challenge;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.practice.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Identifies the attempt from a {@link User} to solve Challenge
 * @author NMC
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeAttempt {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private User user;
	private int factorA;
	private int factorB;
	private int resultAttempt;
	private boolean correct;

}
