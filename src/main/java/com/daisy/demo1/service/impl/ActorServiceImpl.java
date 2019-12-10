package com.daisy.demo1.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daisy.demo1.exceptions.BadRequestException;
import com.daisy.demo1.exceptions.NotFoundException;
import com.daisy.demo1.model.Actor;
import com.daisy.demo1.repository.ActorRepository;
import com.daisy.demo1.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;

	
	@Override
	public Optional<Actor> update(Actor actor) {
		Optional<Actor> persistedActor = actorRepository.findById(actor.getId());
		if (persistedActor.isPresent()) {
			if (Objects.equals(actor.getLogin(), persistedActor.get().getLogin())) {
				return Optional.ofNullable(actorRepository.save(actor));
			} else {
				throw new BadRequestException();
			}
		} else {
			throw new NotFoundException();
		}
	}

	@Override
	public List<Actor> getActorsOrderedByTotalNumberOfEvents() {
		return actorRepository.getActorsOrderedByTotalNumberOfEvents();
	}
}
