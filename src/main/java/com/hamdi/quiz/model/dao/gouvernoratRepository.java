package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.Gouvernorat;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface gouvernoratRepository extends JpaRepository<Gouvernorat,Long> {
    List<Gouvernorat> findAllById(Long id);

}