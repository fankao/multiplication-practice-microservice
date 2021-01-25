package com.practice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.domain.BadgeCard;

public interface BadgeRepository extends CrudRepository<BadgeCard, Long> {

	List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(Long userId);


}
