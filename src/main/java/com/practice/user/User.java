package com.practice.user;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Stores information to identify the user
 * @author NMC
 *
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {
	private Long id;
	private String alias;
}
