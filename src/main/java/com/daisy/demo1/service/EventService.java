package com.daisy.demo1.service;

import java.util.List;
import java.util.Optional;

import com.daisy.demo1.model.Event;

public interface EventService {

	/**
	 * Get Events By Actor Id
	 * 
	 * @param actorId
	 * @return {@link List} of Events
	 */
	List<Event> getEventsByActorId(Long actorId);

	/**
	 * Save Event
	 * 
	 * @param event
	 * @return {@link Optional}
	 */
	Optional<Event> save(Event event);

	/**
	 * Find All Events
	 * 
	 * @return {@link Iterable} of Events
	 */
	Iterable<Event> findAll();

	/**
	 * Delete All Events
	 */
	void deleteAll();
}
