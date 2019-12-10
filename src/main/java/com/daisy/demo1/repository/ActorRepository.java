package com.daisy.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daisy.demo1.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>, CustomActorRepository {


}
