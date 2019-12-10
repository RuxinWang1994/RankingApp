package com.daisy.demo1.repository;

import java.util.List;

import com.daisy.demo1.model.Actor;

public interface CustomActorRepository {

	/**
	 * Get Actors Ordered By Total Number Of Events
	 * 
	 * @return {@link List} of Actors
	 */
	List<Actor> getActorsOrderedByTotalNumberOfEvents();

}
