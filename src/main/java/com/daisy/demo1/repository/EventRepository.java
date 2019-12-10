package com.daisy.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daisy.demo1.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
