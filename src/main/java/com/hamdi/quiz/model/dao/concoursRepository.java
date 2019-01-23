package com.hamdi.quiz.model.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.hamdi.quiz.model.entity.Concours;

import java.util.List;


public interface concoursRepository extends JpaRepository<Concours,Long> {
    List<Concours> findAllById(Long id);
    List<Concours> findAllByAnnee(String annee);
}
