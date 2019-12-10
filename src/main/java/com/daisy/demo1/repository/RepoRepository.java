package com.daisy.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daisy.demo1.model.Repo;

public interface RepoRepository extends JpaRepository<Repo, Long> {
}
