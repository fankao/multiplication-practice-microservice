package com.practice;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.practice.domain.ChallengeSolvedEvent;
import com.practice.service.GameService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class GameEventHandler {
	private final GameService gameService;

	@RabbitListener(queues = "${amqp.queue.gamification}")
	public void handleMultiplicationSolved(final ChallengeSolvedEvent event) {
		log.info("Challenge Solved Event received: {}", event.getAttemptId());
		try {
			gameService.newAttemptForUser(event);
		} catch (final Exception e) {
			log.error("Error when trying to process ChallengeSolvedEvent", e);
			// Avoids the event to be re-queued and reprocessed.
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}

}
