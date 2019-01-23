package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.Candidature;
import com.hamdi.quiz.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface candidatureRepository extends JpaRepository<Candidature,Long> {
    List<Candidature> findAllById(Long id);
    List<Candidature> findCandidatureByUser(User user);
    List<Candidature> findCandidatureByEtat(String etat);
}