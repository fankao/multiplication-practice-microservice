package com.practice.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Stores information to identify the user
 * @author NMC
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String alias;
	public User(final String alias) {
		this(null,alias);
	}
	
	
}
