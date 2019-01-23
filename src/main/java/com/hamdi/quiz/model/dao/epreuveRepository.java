package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.Epreuve;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface epreuveRepository extends JpaRepository<Epreuve,Long> {
    List<Epreuve> findAllById(Long id);

}