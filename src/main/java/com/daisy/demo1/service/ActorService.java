package com.daisy.demo1.service;

import java.util.List;
import java.util.Optional;

import com.daisy.demo1.model.Actor;

public interface ActorService {

	/**
	 * Update the actor
	 * 
	 * @param actor
	 * @return {@link Optional} with the Actor
	 */
	Optional<Actor> update(Actor actor);

	/**
	 * Get Actors Ordered By Total Number Of Events
	 * 
	 * @return {@link List} of Actors
	 */
	List<Actor> getActorsOrderedByTotalNumberOfEvents();
}
